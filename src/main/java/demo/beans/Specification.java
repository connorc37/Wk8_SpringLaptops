package demo.beans;

import javax.persistence.Embeddable;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */

@Embeddable
public class Specification {
	private String processor;
	private String os;
	private String videoCard;
	private int memoryGb;
	private int hardDriveGb;
	
	public Specification() {
		super();
	}

	public Specification(String processor, String os, String videoCard, int memoryGb, int hardDriveGb) {
		super();
		this.processor = processor;
		this.os = os;
		this.videoCard = videoCard;
		this.memoryGb = memoryGb;
		this.hardDriveGb = hardDriveGb;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getVideoCard() {
		return videoCard;
	}

	public void setVideoCard(String videoCard) {
		this.videoCard = videoCard;
	}

	public int getMemoryGb() {
		return memoryGb;
	}

	public void setMemoryGb(int memoryGb) {
		this.memoryGb = memoryGb;
	}

	public int getHardDriveGb() {
		return hardDriveGb;
	}

	public void setHardDriveGb(int hardDriveGb) {
		this.hardDriveGb = hardDriveGb;
	}

	@Override
	public String toString() {
		return "Specification [processor=" + processor + ", os=" + os + ", videoCard=" + videoCard + ", memoryGb="
				+ memoryGb + ", hardDriveGb=" + hardDriveGb + "]";
	}

}
