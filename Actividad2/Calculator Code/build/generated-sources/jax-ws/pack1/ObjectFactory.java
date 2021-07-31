
package pack1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pack1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://pack1/", "helloResponse");
    private final static QName _DivD_QNAME = new QName("http://pack1/", "divD");
    private final static QName _DivDResponse_QNAME = new QName("http://pack1/", "divDResponse");
    private final static QName _DivEResponse_QNAME = new QName("http://pack1/", "divEResponse");
    private final static QName _MinusResponse_QNAME = new QName("http://pack1/", "minusResponse");
    private final static QName _DivE_QNAME = new QName("http://pack1/", "divE");
    private final static QName _Hello_QNAME = new QName("http://pack1/", "hello");
    private final static QName _AddResponse_QNAME = new QName("http://pack1/", "addResponse");
    private final static QName _ProductResponse_QNAME = new QName("http://pack1/", "productResponse");
    private final static QName _FactResponse_QNAME = new QName("http://pack1/", "factResponse");
    private final static QName _Add_QNAME = new QName("http://pack1/", "add");
    private final static QName _Minus_QNAME = new QName("http://pack1/", "minus");
    private final static QName _Product_QNAME = new QName("http://pack1/", "product");
    private final static QName _Fact_QNAME = new QName("http://pack1/", "fact");
    private final static QName _SumResponse_QNAME = new QName("http://pack1/", "sumResponse");
    private final static QName _Sum_QNAME = new QName("http://pack1/", "sum");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pack1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Minus }
     * 
     */
    public Minus createMinus() {
        return new Minus();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Fact }
     * 
     */
    public Fact createFact() {
        return new Fact();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link ProductResponse }
     * 
     */
    public ProductResponse createProductResponse() {
        return new ProductResponse();
    }

    /**
     * Create an instance of {@link FactResponse }
     * 
     */
    public FactResponse createFactResponse() {
        return new FactResponse();
    }

    /**
     * Create an instance of {@link Sum }
     * 
     */
    public Sum createSum() {
        return new Sum();
    }

    /**
     * Create an instance of {@link SumResponse }
     * 
     */
    public SumResponse createSumResponse() {
        return new SumResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link DivEResponse }
     * 
     */
    public DivEResponse createDivEResponse() {
        return new DivEResponse();
    }

    /**
     * Create an instance of {@link MinusResponse }
     * 
     */
    public MinusResponse createMinusResponse() {
        return new MinusResponse();
    }

    /**
     * Create an instance of {@link DivE }
     * 
     */
    public DivE createDivE() {
        return new DivE();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link DivD }
     * 
     */
    public DivD createDivD() {
        return new DivD();
    }

    /**
     * Create an instance of {@link DivDResponse }
     * 
     */
    public DivDResponse createDivDResponse() {
        return new DivDResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "divD")
    public JAXBElement<DivD> createDivD(DivD value) {
        return new JAXBElement<DivD>(_DivD_QNAME, DivD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "divDResponse")
    public JAXBElement<DivDResponse> createDivDResponse(DivDResponse value) {
        return new JAXBElement<DivDResponse>(_DivDResponse_QNAME, DivDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivEResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "divEResponse")
    public JAXBElement<DivEResponse> createDivEResponse(DivEResponse value) {
        return new JAXBElement<DivEResponse>(_DivEResponse_QNAME, DivEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "minusResponse")
    public JAXBElement<MinusResponse> createMinusResponse(MinusResponse value) {
        return new JAXBElement<MinusResponse>(_MinusResponse_QNAME, MinusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "divE")
    public JAXBElement<DivE> createDivE(DivE value) {
        return new JAXBElement<DivE>(_DivE_QNAME, DivE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "productResponse")
    public JAXBElement<ProductResponse> createProductResponse(ProductResponse value) {
        return new JAXBElement<ProductResponse>(_ProductResponse_QNAME, ProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "factResponse")
    public JAXBElement<FactResponse> createFactResponse(FactResponse value) {
        return new JAXBElement<FactResponse>(_FactResponse_QNAME, FactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Minus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "minus")
    public JAXBElement<Minus> createMinus(Minus value) {
        return new JAXBElement<Minus>(_Minus_QNAME, Minus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "fact")
    public JAXBElement<Fact> createFact(Fact value) {
        return new JAXBElement<Fact>(_Fact_QNAME, Fact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "sumResponse")
    public JAXBElement<SumResponse> createSumResponse(SumResponse value) {
        return new JAXBElement<SumResponse>(_SumResponse_QNAME, SumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "sum")
    public JAXBElement<Sum> createSum(Sum value) {
        return new JAXBElement<Sum>(_Sum_QNAME, Sum.class, null, value);
    }

}
