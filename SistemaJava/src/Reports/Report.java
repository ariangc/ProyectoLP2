/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Reports;

import java.util.Date;

/**
 *
 * @author alulab14
 */
public class Report {
    private Date initialDate;
    private Date finalDate;

    public Report(Date initialDate, Date finalDate) {
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }
    
    public void createReport() {
        
    }
    
    public void exportToExcel() {
        
    }

    /**
     * @return the initialDate
     */
    public Date getInitialDate() {
        return initialDate;
    }

    /**
     * @param initialDate the initialDate to set
     */
    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    /**
     * @return the finalDate
     */
    public Date getFinalDate() {
        return finalDate;
    }

    /**
     * @param finalDate the finalDate to set
     */
    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }
}
