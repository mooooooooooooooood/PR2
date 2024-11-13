package PR2.tut07.library;

public class BookItem {
    private String barcode;
    private double price;
    private Format format;
    private BookStatus status;
    private String dateOfPurchase;
    private String publicationDate;

    //Constructor
    public BookItem(String barcode, double price,Format format, BookStatus status, String dateOfPurchase, String publicationDate) throws Exception{
        if (!this.isValidBarcode(barcode)) throw new Exception("Invalid barcode!");
        this.barcode = barcode;

        if (!this.isValidPrice(price)) throw new Exception("Invalid price");
        this.price = price;

        if (!this.isValidFormat(format)) throw new Exception("Invalid format!");
        this.format = format;

        if (!this.isValidStatus(status)) throw new Exception("Invalid status!");
        this.status = status;

        if (!this.isValidDateOfPurchase(dateOfPurchase)) throw new Exception("Invalid date of purchase");
        this.dateOfPurchase = dateOfPurchase;

        if (!this.isValidPublicationDate(publicationDate)) throw new Exception("Invalid publication date");
        this.publicationDate = publicationDate;
    }
    //getter setter
    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) throws Exception{
        if (!this.isValidBarcode(barcode)) throw new Exception("Invalid barcode!");
        this.barcode = barcode;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price)throws Exception {
        if (!this.isValidPrice(price)) throw new Exception("Invalid price");
        this.price = price;
    }

    public Format getFormat() {
        return this.format;
    }

    public void setFormat(Format format) throws Exception {
        if (!this.isValidFormat(format)) throw new Exception("Invalid format!");
        this.format = format;
    }

    public BookStatus getStatus() {
        return this.status;
    }

    public void setStatus(BookStatus status) throws Exception {
        if (!this.isValidStatus(status)) throw new Exception("Invalid status!");
        this.status = status;
    }

    public String getDateOfPurchase() {
        return this.dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase)throws Exception {
        if (!this.isValidDateOfPurchase(dateOfPurchase)) throw new Exception("Invalid date of purchase");
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(String publicationDate) throws  Exception{
        if (!this.isValidPublicationDate(publicationDate)) throw new Exception("Invalid publication date");
        this.publicationDate = publicationDate;
    }
    //validator
    public boolean isValidBarcode (String barcode) {
        return barcode.trim() != null && barcode.trim() != "" && barcode.trim() != " ";
    }

    public boolean isValidPrice (double price) {
        return price > 0;
    }

    public boolean isValidFormat(Format format) {
        return format != null;
    }

    public boolean isValidStatus(BookStatus status) {
        return status != null;
    }

    public boolean isValidDateOfPurchase(String dateOfPurchase) {
        return dateOfPurchase.trim() != null && dateOfPurchase.trim() != " " && dateOfPurchase.trim() != "" && dateOfPurchase.length() <= 10;
    }

    public boolean isValidPublicationDate(String publicationDate) {
        return publicationDate.trim() != null && publicationDate.trim() != "" && publicationDate.trim() != " " && publicationDate.length() <= 10;
    }
    @Override
    public String toString() {
        return "BookItem[" +
                "barcode=" + this.getBarcode() +
                ",price=" + this.getPrice() +
                ",format=" + this.getFormat() +
                ",status=" + this.getStatus() +
                ",dateOfPurchase='" + this.getDateOfPurchase() +
                ",publicationDate='" + this.getPublicationDate() +
                ']';
    }
}

