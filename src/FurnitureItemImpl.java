public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();

        furnitureItem.furnitureCode = 1;
        furnitureItem.furnitureType = "chairs";
        furnitureItem.furnitureUsage = "outdoor";
        furnitureItem.color = "blue";
        furnitureItem.gradeOfFurniture = "grade 1";
        furnitureItem.price = 2000;

        System.out.println("furniture code = " + furnitureItem.furnitureCode);
        System.out.println("furniture type = " + furnitureItem.furnitureType);
        System.out.println("furniture usage = " + furnitureItem.furnitureUsage);
        System.out.println("color = " + furnitureItem.color);
        System.out.println("grade of furniture = " + furnitureItem.gradeOfFurniture);
        System.out.println("price = " + furnitureItem.price);

        System.out.println("Discounted Price:" + furnitureItem.getFinalPriceAfterDiscount());

    }
}