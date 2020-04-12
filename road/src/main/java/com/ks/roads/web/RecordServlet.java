package com.ks.roads.web;




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ks.roads.pojo.BrokenRecord;
import com.ks.roads.pojo.Dljbzlk;
import com.ks.roads.pojo.PCIScore;
import com.ks.roads.pojo.RoadFlatRecord;
import com.ks.roads.pojo.Score;
import com.ks.roads.service.IRFRService;
import com.ks.roads.service.impl.RFRService;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;

@WebServlet("/RecordServlet")
public class RecordServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("璺宠浆鎴愬姛");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String cmd = req.getParameter("cmd");
        System.out.println(cmd);
        if("PCIcal".equals(cmd)){
            PCICal(req, resp);
        }
        
        if ("check".equals(cmd)) {
            System.out.println("鎵ц鏌ョ湅鏂规硶");
            roadlist(req, resp);
        }
        if("basicadd".equals(cmd)){
            try {
                basicadd(req,resp);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if("brokenrecord".equals(cmd)){
            System.out.println("鎵ц鎹熷潖璁板綍");
            try {
                brokenrecord(req,resp);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if ("roadflat".equals(cmd)) {
            System.out.println("鎵цroadflat鏂规硶");
            try {
                roadflat(req, resp);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void PCICal(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        IRFRService service = new RFRService();
        String  date = req.getParameter("rq");
        String roadname = req.getParameter("dlmc");
        Double totallength = Double.parseDouble(req.getParameter("jczc"));
        Double totalwidth = Double.parseDouble(req.getParameter("jczk"));
        Double totalarea = totallength*totalwidth;
        Double brokenarea = Double.parseDouble(req.getParameter("shmj"));
        Double rou = brokenarea/totalarea;
        if(rou<=0.01){
            rou = 0.01;
        }else if(rou<=0.1){
            rou = 0.1;
        }else if(rou<=1){
            rou = 1.0;
        }else if(rou<=10){
            rou = 10.0;
        }else if(rou<=50){
            rou = 50.0;
        }else {
            rou = 100.0;
        }
        List<PCIScore> pciScoreList = service.findAllpci();

        Double totalscore = 0.0;

        String[] brokensorts = req.getParameterValues("checkboxs1");
        if(brokensorts!= null){
            for(int i=0;i<brokensorts.length;i++){
                for(int j=0;j<pciScoreList.size();j++){
                    if(brokensorts[i].equals(pciScoreList.get(j).getBrokentype())
                            &&rou==Double.parseDouble(pciScoreList.get(j).getBrokenrou())){
                        totalscore = totalscore - Double.parseDouble(pciScoreList.get(j).getScorecal());
                    }
                }
            }
        }
        Random random = new Random();
        Double rqi = 20*0.5*random.nextDouble()*5;
        Double pqi = rqi + totalscore*0.5;
        Score score = new Score(roadname, String.valueOf(pqi), String.valueOf(rqi), String.valueOf(totalscore), date);
        req.setAttribute("road", score);
        req.getRequestDispatcher("flnb.jsp").forward(req, resp);

    }

    private void basicadd(HttpServletRequest req, HttpServletResponse resp) throws ParseException, IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String zbdw = req.getParameter("zbdw");
        String dlmc = req.getParameter("dlmc");
        String dlbh = req.getParameter("dlbh");
        String ssxz = req.getParameter("ssxz");
        Integer dldj= Integer.parseInt(req.getParameter("dldj"));

        String dllx = req.getParameter("dllx");
        String lmlx = req.getParameter("lmlx");
        String gldw = req.getParameter("gldw");
        String dlzx = req.getParameter("dlzx");
        String qd = req.getParameter("qd");

        String zd = req.getParameter("zd");
        String sjdw = req.getParameter("sjdw");
        String sgdw = req.getParameter("sgdw");
        String lmdj = req.getParameter("lmdj");
        String sjss = req.getParameter("sjss");

        String lfkdfw = req.getParameter("lfkdfw");
        String dlcd = req.getParameter("dlcd");
        String dlmj = req.getParameter("dlmj");
        String aadt = req.getParameter("aadt");
        String jtldj = req.getParameter("jtldj");

        String glfl = req.getParameter("glfl");
        String yhdw = req.getParameter("yhdw");
        String str1 = req.getParameter("jzny");
        Date jzny = simpleDateFormat.parse(str1);
        String cxdlmhd = req.getParameter("cxdlmhd");
        String cxdjclx = req.getParameter("cxdjclx");

        String cxdjchd = req.getParameter("cxdjchd");
        String cxdcds = req.getParameter("cxdcds");
        String cxdtxfx = req.getParameter("cxdtxfx");
        String cxdkdfw = req.getParameter("cxdkdfw");
        String zfjdcdkd = req.getParameter("zfjdcdkd");

        String yfjdcdkd = req.getParameter("yfjdcdkd");
        String cxdmj = req.getParameter("cxdmj");
        String ywgjzycd = req.getParameter("ymgjzycd");
        String cslx = req.getParameter("cslx");
        String cscd = req.getParameter("cscd");

        String pslx = req.getParameter("pslx");
        String pscd = req.getParameter("pscd");
        String shr = req.getParameter("shr");
        String zbr = req.getParameter("zbr");
        String str2 = req.getParameter("zbrq");
        Date zbrq = simpleDateFormat.parse(str2);


        System.out.println("寮�濮嬪啓鍏�");

        IRFRService service = new RFRService();

        Dljbzlk dljbzlk = new Dljbzlk(zbdw, dlmc, dlbh, ssxz, dldj, dllx, lmlx, gldw, dlzx, qd, zd, sjdw, sgdw, lmdj,
                sjss, lfkdfw, dlcd, dlmj, aadt, jtldj, glfl, yhdw, jzny, cxdlmhd, cxdjclx, cxdjchd, cxdcds, cxdtxfx,
                cxdkdfw, zfjdcdkd, yfjdcdkd, cxdmj, ywgjzycd, cslx, cscd, pslx, pscd, shr, zbr, zbrq);
        service.addDljbzlk(dljbzlk);

        resp.getWriter().write("褰曞叆鎴愬姛锛�2绉掑悗杩斿洖鐣岄潰");

        resp.setHeader("refresh", "2;url=dltj.jsp");
    }


    private void brokenrecord(HttpServletRequest req, HttpServletResponse resp) throws ParseException, IOException {
        String str = req.getParameter("rq");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat.parse(str);
        String qzwz = req.getParameter("qzwz");
        String roadid = req.getParameter("dlbh");
        String roadname = req.getParameter("dlmc");
        String jczc = req.getParameter("jczc");
        String jczk = req.getParameter("jczk");
        String shc = req.getParameter("shc");
        String shk = req.getParameter("shk");
        String shg = req.getParameter("shg");
        String shqkms = req.getParameter("shqkms");
        String shmj = req.getParameter("shmj");
        String shlxmc = req.getParameter("shlxmc");
        String dllx = req.getParameter("dllx");
        String notes = req.getParameter("bz");

        System.out.println("寮�濮嬪啓鍏�");

        IRFRService service = new RFRService();

        BrokenRecord brokenRecord = new BrokenRecord(date1,qzwz,roadid,roadname,jczc,jczk,shc,shk,shg,shqkms,shmj,shlxmc,
                dllx,notes);
        service.addBrokenRecord(brokenRecord);

        resp.getWriter().write("褰曞叆鎴愬姛锛�2绉掑悗杩斿洖鐣岄潰");

        resp.setHeader("refresh", "2;url=/JSPs/lmshjl.jsp");
    }

    private void roadlist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("璺宠浆鍒版煡鐪嬮〉闈�");
        IRFRService service = new RFRService();

        List<RoadFlatRecord> roadList = service.findAll();
        req.setAttribute("list", roadList);
        System.out.println();
        req.getRequestDispatcher("lmpzdck.jsp").forward(req, resp);
    }

    private void roadflat(HttpServletRequest req, HttpServletResponse resp) throws IOException, ParseException {

        String str = req.getParameter("rq");
        System.out.println(str);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat.parse(str);
        String recordnum = req.getParameter("pzdjlh");
        String testperson = req.getParameter("jcry");
        String roadid = req.getParameter("dlbh");
        String roadname = req.getParameter("dlmc");
        String iri = req.getParameter("IRI");
        String notes = req.getParameter("bz");

        System.out.println(date1+" "+recordnum+" "+roadid+" "+roadname+" "+iri);
        System.out.println("寮�濮嬪啓鍏�");

        IRFRService service = new RFRService();

        RoadFlatRecord roadFlatRecord = new RoadFlatRecord(date1, testperson, roadid, roadname, recordnum, iri, notes);

        System.out.println(roadFlatRecord.getDate());
        service.addRecord(roadFlatRecord);

        resp.getWriter().write("褰曞叆鎴愬姛锛�2绉掑悗杩斿洖鐣岄潰");

        resp.setHeader("refresh", "2;url=lmpzd.jsp");

    }
}
