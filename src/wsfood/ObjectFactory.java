
package wsfood;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsfood package. 
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

    private final static QName _CreateCategory_QNAME = new QName("http://soap.workshop.java.simplon.co/", "createCategory");
    private final static QName _GetFoodAttributeById_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getFoodAttributeById");
    private final static QName _CategoryFindByNameResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "categoryFindByNameResponse");
    private final static QName _CreateFoodAttribute_QNAME = new QName("http://soap.workshop.java.simplon.co/", "createFoodAttribute");
    private final static QName _GetFoodAttributeByIdResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getFoodAttributeByIdResponse");
    private final static QName _DeleteFoodAttribute_QNAME = new QName("http://soap.workshop.java.simplon.co/", "deleteFoodAttribute");
    private final static QName _DeleteFoodAttributeResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "deleteFoodAttributeResponse");
    private final static QName _GetFoodAttributeListByName_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getFoodAttributeListByName");
    private final static QName _GetFoodAttributeListByNameResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getFoodAttributeListByNameResponse");
    private final static QName _CategoryFindByName_QNAME = new QName("http://soap.workshop.java.simplon.co/", "categoryFindByName");
    private final static QName _GetCategoryListResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getCategoryListResponse");
    private final static QName _CreateCategoryResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "createCategoryResponse");
    private final static QName _GetCategoryList_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getCategoryList");
    private final static QName _CreateFoodAttributeResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "createFoodAttributeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsfood
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCategoryListResponse }
     * 
     */
    public GetCategoryListResponse createGetCategoryListResponse() {
        return new GetCategoryListResponse();
    }

    /**
     * Create an instance of {@link GetCategoryList }
     * 
     */
    public GetCategoryList createGetCategoryList() {
        return new GetCategoryList();
    }

    /**
     * Create an instance of {@link CreateCategoryResponse }
     * 
     */
    public CreateCategoryResponse createCreateCategoryResponse() {
        return new CreateCategoryResponse();
    }

    /**
     * Create an instance of {@link CreateFoodAttributeResponse }
     * 
     */
    public CreateFoodAttributeResponse createCreateFoodAttributeResponse() {
        return new CreateFoodAttributeResponse();
    }

    /**
     * Create an instance of {@link CategoryFindByName }
     * 
     */
    public CategoryFindByName createCategoryFindByName() {
        return new CategoryFindByName();
    }

    /**
     * Create an instance of {@link DeleteFoodAttributeResponse }
     * 
     */
    public DeleteFoodAttributeResponse createDeleteFoodAttributeResponse() {
        return new DeleteFoodAttributeResponse();
    }

    /**
     * Create an instance of {@link GetFoodAttributeListByName }
     * 
     */
    public GetFoodAttributeListByName createGetFoodAttributeListByName() {
        return new GetFoodAttributeListByName();
    }

    /**
     * Create an instance of {@link GetFoodAttributeListByNameResponse }
     * 
     */
    public GetFoodAttributeListByNameResponse createGetFoodAttributeListByNameResponse() {
        return new GetFoodAttributeListByNameResponse();
    }

    /**
     * Create an instance of {@link CreateCategory }
     * 
     */
    public CreateCategory createCreateCategory() {
        return new CreateCategory();
    }

    /**
     * Create an instance of {@link GetFoodAttributeById }
     * 
     */
    public GetFoodAttributeById createGetFoodAttributeById() {
        return new GetFoodAttributeById();
    }

    /**
     * Create an instance of {@link CategoryFindByNameResponse }
     * 
     */
    public CategoryFindByNameResponse createCategoryFindByNameResponse() {
        return new CategoryFindByNameResponse();
    }

    /**
     * Create an instance of {@link CreateFoodAttribute }
     * 
     */
    public CreateFoodAttribute createCreateFoodAttribute() {
        return new CreateFoodAttribute();
    }

    /**
     * Create an instance of {@link DeleteFoodAttribute }
     * 
     */
    public DeleteFoodAttribute createDeleteFoodAttribute() {
        return new DeleteFoodAttribute();
    }

    /**
     * Create an instance of {@link GetFoodAttributeByIdResponse }
     * 
     */
    public GetFoodAttributeByIdResponse createGetFoodAttributeByIdResponse() {
        return new GetFoodAttributeByIdResponse();
    }

    /**
     * Create an instance of {@link FoodAttribute }
     * 
     */
    public FoodAttribute createFoodAttribute() {
        return new FoodAttribute();
    }

    /**
     * Create an instance of {@link FoodCategory }
     * 
     */
    public FoodCategory createFoodCategory() {
        return new FoodCategory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "createCategory")
    public JAXBElement<CreateCategory> createCreateCategory(CreateCategory value) {
        return new JAXBElement<CreateCategory>(_CreateCategory_QNAME, CreateCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodAttributeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getFoodAttributeById")
    public JAXBElement<GetFoodAttributeById> createGetFoodAttributeById(GetFoodAttributeById value) {
        return new JAXBElement<GetFoodAttributeById>(_GetFoodAttributeById_QNAME, GetFoodAttributeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryFindByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "categoryFindByNameResponse")
    public JAXBElement<CategoryFindByNameResponse> createCategoryFindByNameResponse(CategoryFindByNameResponse value) {
        return new JAXBElement<CategoryFindByNameResponse>(_CategoryFindByNameResponse_QNAME, CategoryFindByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFoodAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "createFoodAttribute")
    public JAXBElement<CreateFoodAttribute> createCreateFoodAttribute(CreateFoodAttribute value) {
        return new JAXBElement<CreateFoodAttribute>(_CreateFoodAttribute_QNAME, CreateFoodAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodAttributeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getFoodAttributeByIdResponse")
    public JAXBElement<GetFoodAttributeByIdResponse> createGetFoodAttributeByIdResponse(GetFoodAttributeByIdResponse value) {
        return new JAXBElement<GetFoodAttributeByIdResponse>(_GetFoodAttributeByIdResponse_QNAME, GetFoodAttributeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFoodAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "deleteFoodAttribute")
    public JAXBElement<DeleteFoodAttribute> createDeleteFoodAttribute(DeleteFoodAttribute value) {
        return new JAXBElement<DeleteFoodAttribute>(_DeleteFoodAttribute_QNAME, DeleteFoodAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFoodAttributeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "deleteFoodAttributeResponse")
    public JAXBElement<DeleteFoodAttributeResponse> createDeleteFoodAttributeResponse(DeleteFoodAttributeResponse value) {
        return new JAXBElement<DeleteFoodAttributeResponse>(_DeleteFoodAttributeResponse_QNAME, DeleteFoodAttributeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodAttributeListByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getFoodAttributeListByName")
    public JAXBElement<GetFoodAttributeListByName> createGetFoodAttributeListByName(GetFoodAttributeListByName value) {
        return new JAXBElement<GetFoodAttributeListByName>(_GetFoodAttributeListByName_QNAME, GetFoodAttributeListByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodAttributeListByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getFoodAttributeListByNameResponse")
    public JAXBElement<GetFoodAttributeListByNameResponse> createGetFoodAttributeListByNameResponse(GetFoodAttributeListByNameResponse value) {
        return new JAXBElement<GetFoodAttributeListByNameResponse>(_GetFoodAttributeListByNameResponse_QNAME, GetFoodAttributeListByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryFindByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "categoryFindByName")
    public JAXBElement<CategoryFindByName> createCategoryFindByName(CategoryFindByName value) {
        return new JAXBElement<CategoryFindByName>(_CategoryFindByName_QNAME, CategoryFindByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getCategoryListResponse")
    public JAXBElement<GetCategoryListResponse> createGetCategoryListResponse(GetCategoryListResponse value) {
        return new JAXBElement<GetCategoryListResponse>(_GetCategoryListResponse_QNAME, GetCategoryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "createCategoryResponse")
    public JAXBElement<CreateCategoryResponse> createCreateCategoryResponse(CreateCategoryResponse value) {
        return new JAXBElement<CreateCategoryResponse>(_CreateCategoryResponse_QNAME, CreateCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getCategoryList")
    public JAXBElement<GetCategoryList> createGetCategoryList(GetCategoryList value) {
        return new JAXBElement<GetCategoryList>(_GetCategoryList_QNAME, GetCategoryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFoodAttributeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "createFoodAttributeResponse")
    public JAXBElement<CreateFoodAttributeResponse> createCreateFoodAttributeResponse(CreateFoodAttributeResponse value) {
        return new JAXBElement<CreateFoodAttributeResponse>(_CreateFoodAttributeResponse_QNAME, CreateFoodAttributeResponse.class, null, value);
    }

}
