package edu.rizza.ihmm;

import java.util.ArrayList;
import java.util.List;

public class Gen {
	private String[] startCodon;
	private String[] stopCodon;
	private String[] codingRegion;

	private final List<Gen> genes = new ArrayList<Gen>();

	public Gen(String[] startCodon) {
		this.startCodon = startCodon;
	}

	public boolean isCompete() {
		return stopCodon.length != 0;
	}

	// geter setter
	public String[] getStartCodon() {
		return startCodon;
	}

	public void setStartCodon(String[] startCodon) {
		this.startCodon = startCodon;
	}

	public String[] getStopCodon() {
		return stopCodon;
	}

	public void setStopCodon(String[] stopCodon) {
		this.stopCodon = stopCodon;
	}

	public String[] getCodingRegion() {
		return codingRegion;
	}

	public void setCodingRegion(String[] codingRegion) {
		this.codingRegion = codingRegion;
	}

}
