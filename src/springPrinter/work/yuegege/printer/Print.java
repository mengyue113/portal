package springPrinter.work.yuegege.printer;

import springPrinter.work.yuegege.ink.Ink;
import springPrinter.work.yuegege.paper.Paper;

public class Print {
	private Ink ink;
	private Paper paper;
	public void print() {
		System.out.println("用"+ink.getColor()+"在"+paper.getPaper()+"上打印内容");
	}
	public Ink getInk() {
		return ink;
	}
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	
	

}
