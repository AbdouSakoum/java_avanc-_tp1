import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IMetier<Produit> metierProduit = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            Produit produit1 = new Produit(1, "amine", "tesla", 120000, "tres bon etat", 9);
            Produit produit2 = new Produit(2, "adam", "adidas", 1500, "tres bon etat", 19);
            Produit produit3 = new Produit(3, "mostafa", "nike", 1300, "tres bon etat", 49);
            Produit produit4 = new Produit(4, "idriss", "dell", 9000, "tres bon etat", 44);
            Produit produit5 = new Produit(5, "mohammed", "hp", 8900, "tres bon etat", 78);
            Produit produit6 = new Produit(6, "mehdi", "oreal", 120, "tres bon etat", 132);
            metierProduit.add(produit1);
            metierProduit.add(produit2);
            metierProduit.add(produit3);
            metierProduit.add(produit4);
            metierProduit.add(produit5);
            metierProduit.add(produit6);
            System.out.println("<<==Genericite==>>\n");
            System.out.println(metierProduit.getAll());
            System.out.println("<<==findById==>>\n");
            System.out.println("<<==Enter id du Produit==>>\n");
            int id = sc.nextInt();
            Produit produit=metierProduit.findById(id);
            if(produit!=null){
                System.out.println(produit);
            }else {
                System.out.println("Aucun produit trouvé avec l'id ");
            }
            System.out.println("<<==deleteById==>>\n");
            System.out.println("<<==Enter id du Produit==>>\n");
            int id2 = sc.nextInt();
            metierProduit.delete(id2);
            System.out.println("<<==New List==>>\n");
            System.out.println(metierProduit.getAll());

            continuer = false;
        }
    }
}