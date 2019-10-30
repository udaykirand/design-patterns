package me.udayd.dp.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		Shape shape = ShapeFactory.getShape("CIRCLE");
		shape.draw();
		shape = ShapeFactory.getShape("RECTANGLE");
		shape.draw();
		shape = ShapeFactory.getShape("SQUARE");
		shape.draw();
	}

}
