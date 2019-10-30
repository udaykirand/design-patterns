package me.udayd.dp.factory;

public class ShapeFactory {

	public static Shape getShape(String shapeType) {
		
		if(shapeType == null) {
			throw new RuntimeException("Invalid shapeType");
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
	
	public static Shape getShapeFromEnum(ShapeTypeEnum shapeType) {
		return shapeType.getInstance();
	}

}
