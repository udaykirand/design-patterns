package me.udayd.dp.factory;

public class ShapeFactory {

	public static Shape getShape(String shapeType) {
		
		if(shapeType == null) {
			return null;
		}
		
		if("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		}
		if("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		}
		if("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}

}
