package com.ks.roads.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ks.roads.pojo.Rcxj;
import com.ks.roads.pojo.Shtzd;
import com.ks.roads.service.IRcxjService;
import com.ks.roads.service.IShtzdService;
import com.ks.roads.service.impl.RcxjService;
import com.ks.roads.service.impl.ShtzdService;

@SuppressWarnings("serial")
@WebServlet("/ShtzdServelet")
public class ShtzdServelet extends HttpServlet{
	
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
			String tzh = req.getParameter("tzh");
			delete(req, resp,tzh);
		}else if ("shtzdList".equals(cmd)) {
			shtzdList(req, resp);
		}
		else if("findby".equals(cmd)) {
			String tzh = req.getParameter("tzh");
			findby(req, resp,tzh);
		}
}






	






	private void findby(HttpServletRequest req, HttpServletResponse resp, String xcry) throws ServletException, IOException {
		
		IRcxjService service = new RcxjService();
		//List<Rcxj> shtzdList = service.findAll();
		List<Rcxj> shtzdList = service.findRcxjByXcry(xcry);
		// �Ѽ��ϴ洢��������
				req.setAttribute("shtzdList", shtzdList);

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
	private void delete(HttpServletRequest req, HttpServletResponse resp, String tzh) throws ServletException, IOException {

		// ����service�еķ���ɾ��rcxj
		IShtzdService service = new ShtzdService();

		service.delete(tzh);

		// ת����emp�б�ҳ��
		req.getRequestDispatcher("/ShtzdServelet?cmd=shtzdList").forward(req, resp);
		//resp.setHeader("refresh", "url=/road/shtzdck.jsp");
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
	private void shtzdList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// ����service�еĲ�ѯ�������ݵķ���
		
		IShtzdService service = new ShtzdService();

		
		List<Shtzd> shtzdList = service.findAll();

		// �Ѽ��ϴ洢��������
		req.setAttribute("shtzdList", shtzdList);

		// ����ת������ʾ���ݵ�ҳ��
		req.getRequestDispatcher("/shtzdck.jsp").forward(req, resp);

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
		String tzh = req.getParameter("tzh");
		String xcry = req.getParameter("xcry");
		String ssmc = req.getParameter("ssmc");
		String shbw = req.getParameter("shbw");
		//String shqkms = req.getParameter("shqkms");
		String shyy = req.getParameter("shyy");
		String clyj = req.getParameter("clyj");
		String jsy = req.getParameter("jsy");
		String rq = req.getParameter("rq");
		String bj = req.getParameter("bj");
		String zxsj = req.getParameter("zxsj");
		String bz = req.getParameter("bz");
		
		java.util.Date rq1 = null;
		try {
			rq1 = new SimpleDateFormat("yyyy-mm-dd").parse(rq);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		java.util.Date zxsj1 = null;
		try {
			zxsj1 = new SimpleDateFormat("yyyy-mm-dd").parse(zxsj);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ��ȡ���������
		IShtzdService service = new ShtzdService();

	
			// �����е����ݷ�װ��ʵ�������
		Shtzd shtzd = new Shtzd(tzh, xcry, ssmc, shbw,shyy,clyj,jsy, rq1, bj, zxsj1,bz);

			// ����ע��ķ���
			service.insert(shtzd);

			//resp.getWriter().write("��ӳɹ�, 3s����ת");

			//resp.setHeader("refresh", "3;url=/road/index.jsp");
			
			req.getRequestDispatcher("/ShtzdServelet?cmd=shtzdList").forward(req, resp);
			//resp.setHeader("refresh", "url=/road/rcxjck.jsp");
			return;
		}
	


}
