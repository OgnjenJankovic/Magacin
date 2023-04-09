package magacin;

import java.util.Objects;

public class KancelarijskiMaterijal {

	
	String naziv;
	int opis, kolicina, sifra;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getOpis() {
		return opis;
	}
	public void setOpis(int opis) {
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KancelarijskiMaterijal other = (KancelarijskiMaterijal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && opis == other.opis
				&& sifra == other.sifra;
	}
	@Override
	public String toString() {
		return "KancelarijskiMaterijal [naziv=" + naziv + ", opis=" + opis + ", kolicina=" + kolicina + ", sifra="
				+ sifra + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
