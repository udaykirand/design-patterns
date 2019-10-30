package me.udayd.dp.factory;

public enum ShapeTypeEnum {
	
	
	CIRCLE {
		@Override
		public Shape getInstance() {
			return new Circle();
		}
	},
	
	SQUARE {
		@Override
		public Shape getInstance() {
			return new Square();
		}
	},
	RECTANGLE {
		@Override
		public Shape getInstance() {
			return new Rectangle();
		}
	};
	
	
	public abstract Shape getInstance();

}
