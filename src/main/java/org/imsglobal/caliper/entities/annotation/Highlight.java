/**
 * 
 */
package org.imsglobal.caliper.entities.annotation;

/**
 * @author pnayak
 * 
 */
public class Highlight extends Annotation {

	private TextPositionSelector selection;
	private String selectionText;

	public Highlight(String id) {
		super(id);
		setType("http://purl.imsglobal.org/caliper/v1/Annotation");
		selection = new TextPositionSelector();
	}

	/**
	 * @return the selection
	 */
	public TextPositionSelector getSelection() {
		return selection;
	}

	/**
	 * @param selection
	 *            the selection to set
	 */
	public void setSelection(TextPositionSelector selection) {
		this.selection = selection;
	}

	/**
	 * @return the selectionText
	 */
	public String getSelectionText() {
		return selectionText;
	}

	/**
	 * @param selectionText
	 *            the selectionText to set
	 */
	public void setSelectionText(String selectionText) {
		this.selectionText = selectionText;
	}

}
