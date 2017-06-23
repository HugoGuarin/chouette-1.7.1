/**
 * Projet CHOUETTE
 *
 * ce projet est sous license libre
 * voir LICENSE.txt pour plus de details
 *
 */

package fr.certu.chouette.exchange.xml.neptune.report;

import java.util.ArrayList;

import fr.certu.chouette.plugin.report.Report;
import fr.certu.chouette.plugin.report.ReportItem;

/**
 * @author michel
 *
 */
public class NeptuneReport extends Report 
{
	// declare message report
    public enum KEY {IMPORT,EXPORT};
    

    public NeptuneReport(KEY key)
    {
    	setOriginKey(key.name());
    }
    
    /**
     * add but don't merge item in list
     * 
     * @param item
     *           to add/merge
     */
    public void addItem(ReportItem item)
    {
       if (getItems() == null)
          setItems(new ArrayList<ReportItem>());
       updateStatus(item.getStatus());
       getItems().add(item);
    }


}
