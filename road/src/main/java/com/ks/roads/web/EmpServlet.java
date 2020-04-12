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

		// ����Ո�󅢔�
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
		// ����service�еĲ�ѯ�������ݵķ���
				IEmpService service = new EmpService();
				//String mm = req.getParameter("mm");
				List<Emp> empList = service.findByNickname(yhm);

				// �Ѽ��ϴ洢��������
				req.setAttribute("myuserList", empList);

				// ����ת������ʾ���ݵ�ҳ��
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
	 * ����idɾ���û�
	 * 
	 * @param req
	 * @param resp
	 * @param yhm   Ҫɾ���û���id
	 * @throws IOException
	 * @throws ServletException
	 */
	private void delete(HttpServletRequest req, HttpServletResponse resp, String yhm) throws ServletException, IOException {

		// ����service�еķ���ɾ��emp
		IEmpService service = new EmpService();

		service.deleteById(yhm);

		// ת����emp�б�ҳ��
		req.getRequestDispatcher("/EmpServlet?cmd=empList").forward(req, resp);

		return;
	}

	/**
	 * �鿴������Ϣ�ķ���
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void empList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// ����service�еĲ�ѯ�������ݵķ���
		IEmpService service = new EmpService();

		List<Emp> empList = service.findAll();

		// �Ѽ��ϴ洢��������
		req.setAttribute("empList", empList);

		// ����ת������ʾ���ݵ�ҳ��
		req.getRequestDispatcher("/empList.jsp").forward(req, resp);

		return;
	}

	/**
	 * ��ȫ�˳��Ĺ���
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	private void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// ����session����
		req.getSession().invalidate();

		// �����ض�����ҳ
		resp.sendRedirect("/road/index.jsp");
	}

	/**
	 * ���������Ҫ������ע�Ṧ��
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ���Ȼ�ȡ��ǰ̨ҳ�洫�ݵ�����
		String yhm = req.getParameter("yhm");
		String mm = req.getParameter("mm");
		//String gender = req.getParameter("gender");
		//double salary = Double.parseDouble(req.getParameter("salary"));

		/**
		 * ���������ж��ǳ��Ƿ��Ѿ���ʹ��, �����ʹ��, ������ע��.
		 */
		// ��ȡ���������
		IEmpService service = new EmpService();

		// �����ж��û����Ƿ���ڵķ���.
		// 1��ʾ����, ��1��ʾ������
		int flag = service.findEmpByNickname(yhm);

		if (flag == 1) {
			// ����ʾ��Ϣ���뵽��������
			req.setAttribute("nicknameMsg", "���ǳ��Ѵ���, �뻻һ���ǳ�");
			// ����ת��
			req.getRequestDispatcher("/register.jsp").forward(req, resp);

			return;
		} else {
			// �����е����ݷ�װ��ʵ�������
			Emp emp = new Emp(yhm, mm);

			// ����ע��ķ���
			service.registerEmp(emp);

			//resp.getWriter().write("ע��ɹ�, 3s����ת����¼ҳ��");

			//resp.setHeader("refresh", "url=/road/index.jsp");
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}

	}

	/**
	 * ����ר�����ڴ����¼���ܵķ���
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		/**
		 * ˼·: 1, ��ȡ���û�������ǳƺ�����<br>
		 * 2, Ȼ��ȥ���ݿ��в����Ƿ������ж�Ӧ�ǳƺ�������û����� 3, �������, �������¼ 4, ���������, ������û�[�˺Ż���������,
		 * �뾭�����¼, �����ǵ��[ע��]]
		 */

		// 1, ��ȡ���û�������ǳƺ�����<br>
		String yhm = req.getParameter("yhm");
		String mm = req.getParameter("mm");

		// 2, Ȼ��ȥ���ݿ��в����Ƿ������ж�Ӧ�ǳƺ�������û�����
		IEmpService service = new EmpService();

		Emp emp = service.findEmpByNicknameAndPassword(yhm, mm);

		if (emp != null) {

			// ��¼�ɹ�, �Ͱѵ�¼���û��洢��session��
			req.getSession().setAttribute("emp", emp);

			//resp.getWriter().write("��¼�ɹ�, 3s��ص���ҳ");
			try {
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//resp.setHeader("refresh", "url=/road/index.jsp");

			return;
		} else {
			resp.getWriter().write("�˺Ż���������, ������¼");
		}

	}

}
