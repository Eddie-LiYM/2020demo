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

		// ����Ո�󅢔�
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
		
		// ���Ȼ�ȡ��ǰ̨ҳ�洫�ݵ�����
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

				
				// ��ȡ���������
				IRcxjService service = new RcxjService();

			
					// �����е����ݷ�װ��ʵ�������
					Rcxj rcxj = new Rcxj(rq1, xcry, dlbh, dlmc,shqkms,bz);
					
					//System.out.println(rcxj);
					//System.out.println(xcry2);
					// ����ע��ķ���
					service.updateRcxj(rcxj,xcry2);

					//resp.getWriter().write("��ӳɹ�, 3s����ת");

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
		// �Ѽ��ϴ洢��������
				req.setAttribute("rcxjList", rcxjList);

				// ����ת������ʾ���ݵ�ҳ��
				req.getRequestDispatcher("/rcxjupdate.jsp").forward(req, resp);

				return;
		
		
	}






	/**
	 * ����xcryɾ��
	 * 
	 * @param req
	 * @param resp
	 * @param xcry   
	 * @throws IOException
	 * @throws ServletException
	 */
	private void delete(HttpServletRequest req, HttpServletResponse resp, String xcry) throws ServletException, IOException {

		// ����service�еķ���ɾ��rcxj
		IRcxjService service = new RcxjService();

		service.deleteByXcry(xcry);

		// ת����emp�б�ҳ��
		req.getRequestDispatcher("/RcxjServelet?cmd=rcxjList").forward(req, resp);
		//resp.setHeader("refresh", "url=/road/rcxjck.jsp");
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
	private void rcxjList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// ����service�еĲ�ѯ�������ݵķ���
		
		IRcxjService service = new RcxjService();
		
		List<Rcxj> rcxjList = service.findAll();

		// �Ѽ��ϴ洢��������
		req.setAttribute("rcxjList", rcxjList);

		// ����ת������ʾ���ݵ�ҳ��
		req.getRequestDispatcher("/rcxjck.jsp").forward(req, resp);

		return;
	}

	
	



	/**
	 * ���������Ҫ��������ӹ���
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ���Ȼ�ȡ��ǰ̨ҳ�洫�ݵ�����
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

		
		// ��ȡ���������
		IRcxjService service = new RcxjService();

	
			// �����е����ݷ�װ��ʵ�������
			Rcxj rcxj = new Rcxj(rq1, xcry, dlbh, dlmc,shqkms,bz);

			// ����ע��ķ���
			service.insertRcxj(rcxj);

			//resp.getWriter().write("��ӳɹ�, 3s����ת");

			//resp.setHeader("refresh", "3;url=/road/index.jsp");
			
			req.getRequestDispatcher("/RcxjServelet?cmd=rcxjList").forward(req, resp);
			//resp.setHeader("refresh", "url=/road/rcxjck.jsp");
			return;
		}
	

	}


