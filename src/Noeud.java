

class Noeud
{
    String str ;
    Noeud filsGauche, filsDroit ;
    int hauteur ;
    
    Noeud (String s, Noeud fg, Noeud fd)
    {
	str = s ;
	filsGauche = fg ;
	filsDroit = fd ;
	calcHauteur (this) ;
    }

    static void calcHauteur (Noeud n)
    {
	int hg = hauteur (n.filsGauche),
	    hd = hauteur (n.filsDroit) ;
	if (hg > hd) n.hauteur = hg + 1 ;
	else n.hauteur = hd + 1 ;
    }

    static int hauteur (Noeud n)
    {
	if (n == null) return 0 ;
	return n.hauteur ;
    }
}
