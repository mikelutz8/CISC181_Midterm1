package pkgShape;

public class Rectangle extends Shape implements Comparable<Object>{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
		if(iWidth < 0)
			throw new IllegalArgumentException("iWidth must be positive");
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int iLength) {
		this.iLength = iLength;
		if(iLength < 0)
			throw new IllegalArgumentException("iLength must be positive");
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return iLength * iWidth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (2*iLength) + (2*iWidth);
	}
	
	public int compareTo(Object obj) {
		int compareObj = (int) ((Rectangle)obj).area();
		return (int) (this.area() - compareObj);
	}

}
