package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	
	private int iDepth;
	
	public Cuboid(int iDepth, int iWidth, int iLength) {
		super(iLength, iWidth);
		this.iDepth = iDepth;
	}
	public int getiDepth() {
		return iDepth;
	}
	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
		if(iDepth < 0)
			throw new IllegalArgumentException("iDepth must be positive");
	}
	
	@Override
	public double area() {
		return 2*((getiLength()*getiWidth()) + (getiWidth()*iDepth) + (iDepth*getiLength()));
	}
	public double volume() {
		return getiLength()*getiWidth()*iDepth;
	}
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Unable to calculate perimeter");
	}
	
	@Override
	public int compareTo(Object obj) {
		int compareObj = (int) ((Cuboid)obj).area();
		return (int) (this.area() - compareObj);
	}
	
	class SortByVolume implements Comparator<Cuboid> {
		
		@Override
		public int compare(Cuboid cub1, Cuboid cub2) {
			return (int) (cub1.volume() - cub2.volume());
		}
	}
	
	class SortByArea implements Comparator<Cuboid> {
		
		@Override
		public int compare(Cuboid cub1, Cuboid cub2) {
			return (int) (cub1.area() - cub2.area());
		}
	}
	

}
