package informa��es;

public class GerenciaPraia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Praia cm=new Praia("Caraguatatuba", "mococa");
		cm.setTipoAgua("salgada");
		cm.setCorAreia("preta");
		System.out.println("A praia "+ cm.getNome());
		System.out.println("de "+ cm.getCidade());
		System.out.println("que possui areia "+ cm.getCorAreia());
		System.out.println("e �gua "+ cm.getTipoAgua());
		cm.visite();
		System.out.println("------------");
		
		Praia pg=new Praia("Ubatuba", "Praia Grande");
		pg.setCorAreia("amarela");
		pg.setTipoAgua("salgada");
		System.out.println("A praia "+ pg.getNome());
		System.out.println("de "+ pg.getCidade());
		System.out.println("que possui areia "+ pg.getCorAreia());
		System.out.println("e �gua "+ pg.getTipoAgua());
		cm.Nvisite();
		System.out.println("------------");
		
		Praia tn=new Praia("Jericoacoara", "Cear�");
		tn.setCorAreia("amarela");
		tn.setTipoAgua("doce");
		System.out.println("A praia "+ tn.getNome());
		System.out.println("de "+ tn.getCidade());
		System.out.println("que possui areia "+ tn.getCorAreia());
		System.out.println("e �gua "+ tn.getTipoAgua());
		tn.visite();
		System.out.println("------------");		
		
		Praia bs=new Praia("Big Sur", "Calif�rnia");
		bs.setCorAreia("rosa");
		bs.setTipoAgua("salgada");
		System.out.println("A praia "+ bs.getNome());
		System.out.println("de "+ bs.getCidade());
		System.out.println("que possui areia "+ bs.getCorAreia());
		System.out.println("e �gua "+ bs.getTipoAgua());
		bs.visite();
		System.out.println("------------");	
		
		Praia fl=new Praia("F�lix", "Ubatuba");
		fl.setCorAreia("amarela");
		fl.setTipoAgua("salgada");
		System.out.println("A praia "+ fl.getNome());
		System.out.println("de "+ fl.getCidade());
		System.out.println("que possui areia "+ fl.getCorAreia());
		System.out.println("e �gua "+ fl.getTipoAgua());
		bs.visite();
		System.out.println("------------");
		
		Praia tnr=new Praia("Ten�rio", "Ubatuba");
		tnr.setCorAreia("amarela");
		tnr.setTipoAgua("salgada");
		System.out.println("A praia "+ tnr.getCidade());
		System.out.println("de "+ tnr.getNome());
		System.out.println("que possui areia "+ tnr.getCorAreia());
		System.out.println("e �gua "+ tnr.getTipoAgua());
		tnr.visite();
		System.out.println("------------");
		
		
		
		}
	

}
