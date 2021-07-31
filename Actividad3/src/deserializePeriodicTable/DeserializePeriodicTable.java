package deserializePeriodicTable;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class DeserializePeriodicTable {

    public static void main(String[] args) {
        try {
            Serializer serializer = new Persister();
            String source = getAtomicNumber("Gold");
            NewDataSet1 NewDataSet = new NewDataSet1();
            serializer.read(NewDataSet, source);

            System.out.println(NewDataSet.getTable().getAtomicNumber());
            System.out.println(NewDataSet.getTable().getElementName());
            System.out.println(NewDataSet.getTable().getSymbol());
            System.out.println(NewDataSet.getTable().getAtomicWeight());
            System.out.println(NewDataSet.getTable().getBoilingPoint());
            System.out.println(NewDataSet.getTable().getIonisationPotential());
            System.out.println(NewDataSet.getTable().getEletroNegativity());
            System.out.println(NewDataSet.getTable().getAtomicRadius());
            System.out.println(NewDataSet.getTable().getMeltingPoint());
            System.out.println(NewDataSet.getTable().getDensity());
        } catch (Exception e) {
        }

    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    

}
