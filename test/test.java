
import java.util.List;
import sample.jobdetails.jobdetails;
import sample.jobdetails.jobdetailsDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HI
 */
public class test {
    public static void main(String[] args){
        jobdetailsDAO jobDAO = new jobdetailsDAO();
        List<jobdetails> list = jobDAO.getListJobdetails();
        for (jobdetails a : list){
            System.out.println(a.getIdJobde()+" "+a.getNameJobde()+" "+a.getJobDesciption()+" "+a.getJobRequest()+" "+a.getRights()+" "+a.getWorkPlace()+" "+a.getDegree()+" "+a.getExperience()+" "+a.getApplieddate()+" "+a.getJd_idJob());
        }
    }
}
