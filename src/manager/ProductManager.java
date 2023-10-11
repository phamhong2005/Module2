package manager;

import ReadWriteFile.ReadAndWriteFile;
import model.Product;

import java.util.ArrayList;

public class ProductManager implements IManagerProduct<Product> {
    ArrayList<Product> list;
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    public ProductManager() {
        this.list = readAndWriteFile.list();
    }

    @Override
    public void add(Product product) {
        list.add(product);
        readAndWriteFile.writeFile(list);
    }

    @Override
    public void update(int producCode, Product product) {
        int index = findByid(producCode);
        list.set(index, product);
        readAndWriteFile.writeFile(list);
    }

    @Override
    public void remove(int productCode) {
        int index = findByid(productCode);
        list.remove(index);
        readAndWriteFile.writeFile(list);
    }

    @Override
    public ArrayList<Product> findAll() {
        return list;
    }

    @Override
    public int findByid(int productCode) {
        for (int i = 0; i < list.size(); i++) {
            if (productCode == list.get(i).getProductCode()) {
                return i;
            }
        }
        return -1;
    }


    public Product maxMoney() {
        Product maxMonney = list.get(0);
        for (Product product : list) {
            if (product.getPrice() > maxMonney.getPrice()) {
                maxMonney = product;
            }
        }
        return maxMonney;
    }

    public void sortIncreaseProduct() {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                if (list.get(j).getPrice() > list.get(j + 1).getPrice()) {
                    Product temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        for (Product product : list) {
            System.out.println(product);
        }
    }

}
