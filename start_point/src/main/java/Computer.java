public class Computer {

    private int storage;
    private String printerModel;

    public Computer(int inputStorage) {
        this.storage = inputStorage;
        this.printerModel = "not connected";
    }

    public int getStorage() {
        return this.storage;
    }

    public void setStorage(int newStorage) {
        this.storage = newStorage;
    }

    public String getPrinterModel() {
        return this.printerModel;
    }

    public void setPrinterModel(String newPrinterModel) {
        this.printerModel = newPrinterModel;
    }

    public void printMessage(String message) {
        
        if (!this.printerModel.equals("not connected")) {
            System.out.println(message);
        }
        
    }

}
