package database;

import com.example.user.myapplication.R;
import models.RestaurantCategory;
import models.RestaurantProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoryList {

    private int tempId = 0;

    List<RestaurantProduct> productList = Arrays.asList(
            new RestaurantProduct(tempId++,"A", "ABCD", 1, 20, 1, 100, R.drawable.restaurant1),
            new RestaurantProduct(tempId++,"B", "BCEF", 1, 20, 1, 200, R.drawable.restaurant2),
            new RestaurantProduct(tempId++,"C", "CDRF", 1, 20, 1,30, R.drawable.restaurant3),
            new RestaurantProduct(tempId++,"D", "JUIK", 1, 20, 3, 20,R.drawable.restaurant4),
            new RestaurantProduct(tempId++,"E", "IUYT", 1, 20, 3,  100,R.drawable.restaurant5),
            new RestaurantProduct(tempId++,"F", "LOPK", 1, 20, 1, 220,R.drawable.restaurant6),
            new RestaurantProduct(tempId++,"G", "AGTY", 1, 20, 1, 210,R.drawable.restaurant7),
            new RestaurantProduct(tempId++,"H", "PLOU", 1, 20, 3, 150,R.drawable.restaurant8),
            new RestaurantProduct(tempId++,"I", "AFGT", 1, 20, 1, 290,R.drawable.restaurant9),
            new RestaurantProduct(tempId++,"J", "LOPI", 2, 20, 1,180, R.drawable.restaurant2),
            new RestaurantProduct(tempId++,"K", "AGTY", 2, 20, 1,360, R.drawable.restaurant2),
            new RestaurantProduct(tempId++,"L", "ADER", 2, 20, 2,260, R.drawable.restaurant2),
            new RestaurantProduct(tempId++,"M", "BHYT", 2, 20, 2, 580,R.drawable.restaurant2),
            new RestaurantProduct(tempId++,"N", "ABGY", 3, 20, 2, 110,R.drawable.restaurant3),
            new RestaurantProduct(tempId++,"O", "ALOP", 3, 20, 2, 90,R.drawable.restaurant3),
            new RestaurantProduct(tempId++,"P", "AFRT", 3, 20, 1, 99,R.drawable.restaurant3),
            new RestaurantProduct(tempId++,"Q", "POIU", 3, 20, 1,199,R.drawable.restaurant3),
            new RestaurantProduct(tempId++,"R", "AGTY", 3, 20, 3,39,R.drawable.restaurant3),
            new RestaurantProduct(tempId++,"S", "ALPI", 4, 20, 3,40,R.drawable.restaurant4),
            new RestaurantProduct(tempId++,"T", "ADER", 4, 20, 3,250,R.drawable.restaurant4),
            new RestaurantProduct(tempId++,"U", "LIUY", 4, 20, 3,200,R.drawable.restaurant4),
            new RestaurantProduct(tempId++,"V", "BNMK", 5, 20, 3,200,R.drawable.restaurant5),
            new RestaurantProduct(tempId++,"W", "LOAR", 5, 20, 3,200,R.drawable.restaurant5),
            new RestaurantProduct(tempId++,"X", "POLN", 5, 20, 1,200,R.drawable.restaurant5),
            new RestaurantProduct(tempId++,"Y", "ACDH", 6, 20, 1,200,R.drawable.restaurant6),
            new RestaurantProduct(tempId++,"Z", "AMNB", 6, 20, 1,200,R.drawable.restaurant6),
            new RestaurantProduct(tempId++,"LK", "AMVL", 6, 20, 1,200,R.drawable.restaurant6),
            new RestaurantProduct(tempId++,"LP", "LPOI", 7, 20, 1,200,R.drawable.restaurant7),
            new RestaurantProduct(tempId++,"FG", "ADER", 7, 20, 3,200,R.drawable.restaurant7),
            new RestaurantProduct(tempId++,"GH", "ALPO", 7, 20, 1,200,R.drawable.restaurant7),
            new RestaurantProduct(tempId++,"AP", "ACFF", 8, 20, 1,200,R.drawable.restaurant8),
            new RestaurantProduct(tempId++,"AG", "LLLJ", 8, 20, 1,200,R.drawable.restaurant8),
            new RestaurantProduct(tempId++,"AC", "OOPK", 8, 20, 2,200,R.drawable.restaurant8),
            new RestaurantProduct(tempId++,"AK", "OIUY", 8, 20, 2,200,R.drawable.restaurant8),
            new RestaurantProduct(tempId++,"AP", "ASDE", 8, 20, 3,200,R.drawable.restaurant8),
            new RestaurantProduct(tempId++,"AD", "PPOI", 9, 20, 1,200,R.drawable.restaurant9),
            new RestaurantProduct(tempId++,"AV", "QQET", 9, 20, 3,200,R.drawable.restaurant9),
            new RestaurantProduct(tempId++,"AVT", "SSTR", 9, 20, 1,50,R.drawable.restaurant9),
            new RestaurantProduct(tempId++,"ALO", "PORT", 10, 20,1,100, R.drawable.restaurant10),
            new RestaurantProduct(tempId++,"APO", "AERT", 10, 20, 2,200,R.drawable.restaurant10),
            new RestaurantProduct(tempId++,"AAR", "KOLP", 10, 20, 2,300,R.drawable.restaurant10),
            new RestaurantProduct(tempId++,"AFG", "ZASR", 10, 20, 1,500,R.drawable.restaurant10)
    );

    public List<RestaurantCategory> categoryLists = Arrays.asList(

            new RestaurantCategory(1, "Fast Food", "Unhygienic Food", 1, productList, R.drawable.restaurant1),
            new RestaurantCategory(2, "Chinese f", "Unhygienic Food", 2, productList, R.drawable.restaurant2),
            new RestaurantCategory(3, "Pizzassss", "Unhygienic Food", 1, productList, R.drawable.restaurant3),
            new RestaurantCategory(3, "Pifdzdfss", "Unhygienic Food", 1, productList, R.drawable.restaurant3),
            new RestaurantCategory(3, "Pizdfdfss", "Unhygienic Food", 3, productList, R.drawable.restaurant3),
            new RestaurantCategory(3, "Pizzdffds", "Unhygienic Food", 5, productList, R.drawable.restaurant3),
            new RestaurantCategory(3, "Pisfdfdff", "Unhygienic Food", 1, productList, R.drawable.restaurant3),
            new RestaurantCategory(3, "sdfsdfsff", "Unhygienic Food", 2, productList, R.drawable.restaurant3),
            new RestaurantCategory(3, "sdfsdfdsf", "Unhygienic Food", 1, productList, R.drawable.restaurant3),
            new RestaurantCategory(3, "fghnfhddd", "Unhygienic Food", 3, productList, R.drawable.restaurant3),
            new RestaurantCategory(3, "fhfghfdgf", "Unhygienic Food", 1, productList, R.drawable.restaurant3),
            new RestaurantCategory(3, "fghgfhffd", "Unhygienic Food", 1, productList, R.drawable.restaurant3),
            new RestaurantCategory(3, "rtyrghfdd", "Unhygienic Food", 1, productList, R.drawable.restaurant3)
    );


    private boolean add;

    public List<RestaurantCategory> getByRestaurantId(int id)
    {
        List<RestaurantCategory> categories = new ArrayList<RestaurantCategory>() ;
        for(RestaurantCategory category:categoryLists)
        {
            if (category.getRestaurantId() == id)
            {
                categories.add(category);
            }
        }
        return categories;
    }

    public List<RestaurantProduct> getProductList(int resId, int catId){

        List<RestaurantProduct> products = new ArrayList<RestaurantProduct>();
        for (RestaurantProduct product: productList){
            if (product.restaurantId == resId && product.categoryId == catId){
                products.add(product);
            }
        }
        return products;
    }
}
