/**
 * 
 */
package org.imsglobal.caliper.entities.assessment;

import org.imsglobal.caliper.entities.CaliperDigitalResource;
import org.imsglobal.caliper.entities.qti.Assessment;

/**
 * @author pnayak
 * 
 * Caliper representation of an Assessment.
 * 
 * Part of the Assessment Metric Profile
 *
 */
public class CaliperAssessment extends CaliperDigitalResource implements
		Assessment {
	
	public CaliperAssessment(String id) {
		super();
		setId(id);
		setType("http://purl.imsglobal.org/caliper/v1/Assessment");
	}

}
