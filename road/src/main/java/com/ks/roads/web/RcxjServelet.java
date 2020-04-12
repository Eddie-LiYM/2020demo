package com.ks.roads.web;

import java.awt.SystemTray;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.protobuf.TextFormat.ParseException;
import com.ks.roads.pojo.Rcxj;
import com.ks.roads.service.IRcxjService;
import com.ks.roads.service.impl.RcxjService;
import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;


@SuppressWarnings("serial")
@WebServlet("/RcxjServelet")
public class RcxjServelet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		// 接收請求參數
		String cmd = req.getParameter("cmd");
		//System.out.println(cmd);

		if ("insert".equals(cmd)) {
			insert(req, resp);
		}else if("delete".equals(cmd)) {
			String xcry = req.getParameter("xcry");
			delete(req, resp,xcry);
		}else if ("rcxjList".equals(cmd)) {
			rcxjList(req, resp);
		}
		else if("findby".equals(cmd)) {
			String xcry = req.getParameter("xcry");
			findby(req, resp,xcry);
		}else if ("update".equals(cmd)) {
			String xcry2 = req.getParameter("xcry2");
			update(req, resp,xcry2);
		}

}






	private void update(HttpServletRequest req, HttpServletResponse resp, String xcry2) {
		
		// 首先获取到前台页面传递的数据
				String rq = req.getParameter("rq");
				String xcry = req.getParameter("xcry");
				//System.out.println(xcry);
				String dlbh = req.getParameter("dlbh");
				String dlmc = req.getParameter("dlmc");
				String shqkms = req.getParameter("shqkms");
				String bz = req.getParameter("bz");
				
				java.util.Date rq1 = null;
				try {
					rq1 = new SimpleDateFormat("yyyy-mm-dd").parse(rq);
				} catch (java.text.ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				// 获取到服务对象
				IRcxjService service = new RcxjService();

			
					// 把所有的数据封装到实体对象中
					Rcxj rcxj = new Rcxj(rq1, xcry, dlbh, dlmc,shqkms,bz);
					
					//System.out.println(rcxj);
					//System.out.println(xcry2);
					// 调用注册的方法
					service.updateRcxj(rcxj,xcry2);

					//resp.getWriter().write("添加成功, 3s后跳转");

					//resp.setHeader("refresh", "3;url=/road/index.jsp");
					
					try {
						req.getRequestDispatcher("/RcxjServelet?cmd=rcxjList").forward(req, resp);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						System.out.println("!!!!!");
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//resp.setHeader("refresh", "url=/road/rcxjck.jsp");
					return;
		
	}






	private void findby(HttpServletRequest req, HttpServletResponse resp, String xcry) throws ServletException, IOException {
		
		IRcxjService service = new RcxjService();
		//List<Rcxj> rcxjList = service.findAll();
		List<Rcxj> rcxjList = service.findRcxjByXcry(xcry);
		// 把集合存储到请求域
				req.setAttribute("rcxjList", rcxjList);

				// 请求转发到显示数据的页面
				req.getRequestDispatcher("/rcxjupdate.jsp").forward(req, resp);

				return;
		
		
	}






	/**
	 * 根据xcry删除
	 * 
	 * @param req
	 * @param resp
	 * @param xcry   
	 * @throws IOException
	 * @throws ServletException
	 */
	private void delete(HttpServletRequest req, HttpServletResponse resp, String xcry) throws ServletException, IOException {

		// 调用service中的方法删除rcxj
		IRcxjService service = new RcxjService();

		service.deleteByXcry(xcry);

		// 转发到emp列表页面
		req.getRequestDispatcher("/RcxjServelet?cmd=rcxjList").forward(req, resp);
		//resp.setHeader("refresh", "url=/road/rcxjck.jsp");
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
	private void rcxjList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 调用service中的查询所有数据的方法
		
		IRcxjService service = new RcxjService();
		
		List<Rcxj> rcxjList = service.findAll();

		// 把集合存储到请求域
		req.setAttribute("rcxjList", rcxjList);

		// 请求转发到显示数据的页面
		req.getRequestDispatcher("/rcxjck.jsp").forward(req, resp);

		return;
	}

	
	



	/**
	 * 这个方法主要用来做添加功能
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 首先获取到前台页面传递的数据
		String rq = req.getParameter("rq");
		String xcry = req.getParameter("xcry");
		String dlbh = req.getParameter("dlbh");
		String dlmc = req.getParameter("dlmc");
		String shqkms = req.getParameter("shqkms");
		String bz = req.getParameter("bz");
		
		java.util.Date rq1 = null;
		try {
			rq1 = new SimpleDateFormat("yyyy-mm-dd").parse(rq);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// 获取到服务对象
		IRcxjService service = new RcxjService();

	
			// 把所有的数据封装到实体对象中
			Rcxj rcxj = new Rcxj(rq1, xcry, dlbh, dlmc,shqkms,bz);

			// 调用注册的方法
			service.insertRcxj(rcxj);

			//resp.getWriter().write("添加成功, 3s后跳转");

			//resp.setHeader("refresh", "3;url=/road/index.jsp");
			
			req.getRequestDispatcher("/RcxjServelet?cmd=rcxjList").forward(req, resp);
			//resp.setHeader("refresh", "url=/road/rcxjck.jsp");
			return;
		}
	

	}


