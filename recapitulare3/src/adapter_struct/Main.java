package adapter_struct;

//B.5. Restaurantul achiziționează un nou soft nou pentru lucrul de la bar, însă acesta nu este
//compatibil cu softul de printare facturi folosit pentru produsele de la bucătărie. Vechiul soft era
//compatibil deoarece au fost realizate de aceeași echipa. Să se implementeze un nivel intermediar
//prin care noul soft să poată fi folosit cu softul existent, fără a se modifica codul din vreo aplicație.

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant();

        SoftPrintareFacturi softBucatarie=new SoftBucatarie();
        restaurant.proceseazaFactura(softBucatarie,"Pizza",45.0);

        SoftBarNou softBarNou=new SoftBarNou();

        SoftPrintareFacturi adapterBar=new AdapterSoftBar(softBarNou);
        restaurant.proceseazaFactura(adapterBar,"Cafea",12.5);
    }
}
