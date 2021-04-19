public class ProductFile {
    private String productId;
    private String productName;
    private String productManufacturer;
    private int productPrice;
    private String productOtherDescription;

    public ProductFile() {

    }

    public ProductFile(String productId, String productName, String productManufacturer, int productPrice, String productOtherDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        this.productPrice = productPrice;
        this.productOtherDescription = productOtherDescription;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductOtherDescription() {
        return productOtherDescription;
    }

    public void setProductOtherDescription(String productOtherDescription) {
        this.productOtherDescription = productOtherDescription;
    }

    public void printProduct() {
        System.out.println("Mã sản phẩm: " + this.getProductId());
        System.out.println("Tên sản phẩm: " + this.getProductName());
        System.out.println("Hãng sản xuất: " + this.getProductManufacturer());
        System.out.println("Giá: " + this.getProductPrice());
        System.out.println("Các mô tả khác: " + this.getProductOtherDescription());
    }
}
