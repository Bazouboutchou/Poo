package tp1;

public class Noeud {
	private int element;
	private Noeud fd;
	private Noeud fg;
	
	public Noeud(int element, Noeud fd, Noeud fg) {
		this.element = element;
		this.fd = fd;
		this.fg = fg;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public Noeud getFd() {
		return fd;
	}

	public void setFd(Noeud fd) {
		this.fd = fd;
	}

	public Noeud getFg() {
		return fg;
	}

	public void setFg(Noeud fg) {
		this.fg = fg;
	}


}
