package builder.example;

public class Block {
    String name;
    String shape;
    String color;
    String penWidth;

    public String getName() {
        return name;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public String getPenWidth() {
        return penWidth;
    }

    @Override
    public String toString() {
        return "Block{" +
                "name='" + name + '\'' +
                ", shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                ", penWidth='" + penWidth + '\'' +
                '}';
    }

    private Block(BlockBuilder builder){
        this.color = builder.color;
        this.name = builder.name;
        this.penWidth = builder.penWidth;
        this.shape = builder.shape;
    }

    public static class BlockBuilder{
        String name;
        String shape;
        String color;
        String penWidth;

        public BlockBuilder() {
        }

        public BlockBuilder name(String name){
            this.name = name;
            return this;
        }
        public BlockBuilder shape(String shape){
            this.shape = shape;
            return this;
        }
        public BlockBuilder color(String color){
            this.color = color;
            return this;
        }
        public BlockBuilder penWidth(String penWidth){
            this.penWidth = penWidth;
            return this;
        }
        public Block build(){
            return new Block(this);
        }
    }
}
