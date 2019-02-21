public class FurnitureTest {
    public static void main(String[] args) {
        WoodenChair wChair = new WoodenChair();
        wChair.fireTest();
        wChair.stressTest();
        MetallicChair mChair = new MetallicChair();
        mChair.fireTest();
        mChair.stressTest();
        WoodenTable wTable = new WoodenTable();
        wTable.fireTest();
        wTable.stressTest();
        MetallicTable mTable = new MetallicTable();
        mTable.fireTest();
        mTable.stressTest();
    }
}