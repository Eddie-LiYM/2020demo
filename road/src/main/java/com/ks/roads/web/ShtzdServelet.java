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

		// 接收請求參數
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
		// 把集合存储到请求域
				req.setAttribute("shtzdList", shtzdList);

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
	private void delete(HttpServletRequest req, HttpServletResponse resp, String tzh) throws ServletException, IOException {

		// 调用service中的方法删除rcxj
		IShtzdService service = new ShtzdService();

		service.delete(tzh);

		// 转发到emp列表页面
		req.getRequestDispatcher("/ShtzdServelet?cmd=shtzdList").forward(req, resp);
		//resp.setHeader("refresh", "url=/road/shtzdck.jsp");
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
	private void shtzdList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 调用service中的查询所有数据的方法
		
		IShtzdService service = new ShtzdService();

		
		List<Shtzd> shtzdList = service.findAll();

		// 把集合存储到请求域
		req.setAttribute("shtzdList", shtzdList);

		// 请求转发到显示数据的页面
		req.getRequestDispatcher("/shtzdck.jsp").forward(req, resp);

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
		
		// 获取到服务对象
		IShtzdService service = new ShtzdService();

	
			// 把所有的数据封装到实体对象中
		Shtzd shtzd = new Shtzd(tzh, xcry, ssmc, shbw,shyy,clyj,jsy, rq1, bj, zxsj1,bz);

			// 调用注册的方法
			service.insert(shtzd);

			//resp.getWriter().write("添加成功, 3s后跳转");

			//resp.setHeader("refresh", "3;url=/road/index.jsp");
			
			req.getRequestDispatcher("/ShtzdServelet?cmd=shtzdList").forward(req, resp);
			//resp.setHeader("refresh", "url=/road/rcxjck.jsp");
			return;
		}
	


}
