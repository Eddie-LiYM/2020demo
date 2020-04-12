package com.ks.roads.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ks.roads.pojo.Emp;
import com.ks.roads.service.IEmpService;
import com.ks.roads.service.impl.EmpService;



@SuppressWarnings("serial")
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		// 接收請求參數
		String cmd = req.getParameter("cmd");
		
		// System.out.println(cmd);
		

		if ("login".equals(cmd)) {
			login(req, resp);
		} else if ("register".equals(cmd)) {
			register(req, resp);
		} else if ("logout".equals(cmd)) {
			logout(req, resp);
		} else if ("empList".equals(cmd)) {
			empList(req, resp);
		} else if ("delete".equals(cmd)) {
			String yhm = req.getParameter("yhm");

			delete(req, resp, yhm);
		}
		else if("findby".equals(cmd)) {
			String yhm = req.getParameter("yhm");
			findby(req, resp,yhm);
		}

	}

	private void findby(HttpServletRequest req, HttpServletResponse resp, String yhm) {
		// 调用service中的查询所有数据的方法
				IEmpService service = new EmpService();
				//String mm = req.getParameter("mm");
				List<Emp> empList = service.findByNickname(yhm);

				// 把集合存储到请求域
				req.setAttribute("myuserList", empList);

				// 请求转发到显示数据的页面
				try {
					req.getRequestDispatcher("/myuserList.jsp").forward(req, resp);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return;
		
	}

	/**
	 * 根据id删除用户
	 * 
	 * @param req
	 * @param resp
	 * @param yhm   要删除用户的id
	 * @throws IOException
	 * @throws ServletException
	 */
	private void delete(HttpServletRequest req, HttpServletResponse resp, String yhm) throws ServletException, IOException {

		// 调用service中的方法删除emp
		IEmpService service = new EmpService();

		service.deleteById(yhm);

		// 转发到emp列表页面
		req.getRequestDispatcher("/EmpServlet?cmd=empList").forward(req, resp);

		return;
	}

	/**
	 * 查看所有信息的方法
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void empList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 调用service中的查询所有数据的方法
		IEmpService service = new EmpService();

		List<Emp> empList = service.findAll();

		// 把集合存储到请求域
		req.setAttribute("empList", empList);

		// 请求转发到显示数据的页面
		req.getRequestDispatcher("/empList.jsp").forward(req, resp);

		return;
	}

	/**
	 * 安全退出的功能
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	private void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// 销毁session对象
		req.getSession().invalidate();

		// 马上重定向到主页
		resp.sendRedirect("/road/index.jsp");
	}

	/**
	 * 这个方法主要用来做注册功能
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 首先获取到前台页面传递的数据
		String yhm = req.getParameter("yhm");
		String mm = req.getParameter("mm");
		//String gender = req.getParameter("gender");
		//double salary = Double.parseDouble(req.getParameter("salary"));

		/**
		 * 可以首先判断昵称是否已经被使用, 如果被使用, 则不允许注册.
		 */
		// 获取到服务对象
		IEmpService service = new EmpService();

		// 调用判断用户名是否存在的方法.
		// 1表示存在, 非1表示不存在
		int flag = service.findEmpByNickname(yhm);

		if (flag == 1) {
			// 把提示信息放入到请求域中
			req.setAttribute("nicknameMsg", "该昵称已存在, 请换一个昵称");
			// 请求转发
			req.getRequestDispatcher("/register.jsp").forward(req, resp);

			return;
		} else {
			// 把所有的数据封装到实体对象中
			Emp emp = new Emp(yhm, mm);

			// 调用注册的方法
			service.registerEmp(emp);

			//resp.getWriter().write("注册成功, 3s后跳转到登录页面");

			//resp.setHeader("refresh", "url=/road/index.jsp");
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}

	}

	/**
	 * 这是专门用于处理登录功能的方法
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		/**
		 * 思路: 1, 获取到用户输入的昵称和密码<br>
		 * 2, 然后去数据库中查找是否正好有对应昵称和密码的用户存在 3, 如果存在, 则允许登录 4, 如果不存在, 则告诉用户[账号或密码有误,
		 * 请经检查后登录, 或者是点击[注册]]
		 */

		// 1, 获取到用户输入的昵称和密码<br>
		String yhm = req.getParameter("yhm");
		String mm = req.getParameter("mm");

		// 2, 然后去数据库中查找是否正好有对应昵称和密码的用户存在
		IEmpService service = new EmpService();

		Emp emp = service.findEmpByNicknameAndPassword(yhm, mm);

		if (emp != null) {

			// 登录成功, 就把登录的用户存储到session中
			req.getSession().setAttribute("emp", emp);

			//resp.getWriter().write("登录成功, 3s后回到主页");
			try {
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//resp.setHeader("refresh", "url=/road/index.jsp");

			return;
		} else {
			resp.getWriter().write("账号或密码有误, 请检查后登录");
		}

	}

}
