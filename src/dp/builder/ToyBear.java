package dp.builder;

public class ToyBear {

	public ToyBear() {
		// TODO Auto-generated constructor stub
	}
	private String style;
	
	public void setSkinStyle(String style) {
		this.style = style;
	}
	
	private boolean isFilled;
	public void setIsFilled(boolean isFilled) {
		this.isFilled= isFilled;
	}
	
	private boolean isSewn;
	public void isSewn(boolean isSewn) {
		this.isSewn= isSewn;
	}
	@Override
	public String toString() {
		return "Product [style=" + style + ", isFilled=" + isFilled + ", isSewn=" + isSewn + "]";
	}
	
	

}
