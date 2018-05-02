package schach_spiel;

import javax.swing.*;
import java.awt.*;

public class Schach_GUI {
    public JPanel Schachfeld;
    private JButton a8;
    private JButton a7;
    private JButton a6;
    private JButton a5;
    private JButton a4;
    private JButton a3;
    private JButton a2;
    private JButton a1;
    private JButton spielStartenButton;
    private JButton b8;
    private JButton b7;
    private JButton b6;
    private JButton b5;
    private JButton b4;
    private JButton b3;
    private JButton b2;
    private JButton b1;
    private JButton c8;
    private JButton c7;
    private JButton c6;
    private JButton c5;
    private JButton c4;
    private JButton c3;
    private JButton c2;
    private JButton c1;
    private JButton d8;
    private JButton d7;
    private JButton d6;
    private JButton d5;
    private JButton d4;
    private JButton d3;
    private JButton d2;
    private JButton d1;
    private JButton e8;
    private JButton e7;
    private JButton e6;
    private JButton e5;
    private JButton e4;
    private JButton e3;
    private JButton e2;
    private JButton e1;
    private JButton f8;
    private JButton f7;
    private JButton f6;
    private JButton f5;
    private JButton f4;
    private JButton f3;
    private JButton f2;
    private JButton f1;
    private JButton g8;
    private JButton g7;
    private JButton g6;
    private JButton g5;
    private JButton g4;
    private JButton g3;
    private JButton g2;
    private JButton g1;
    private JButton h8;
    private JButton h7;
    private JButton h6;
    private JButton h5;
    private JButton h4;
    private JButton h3;
    private JButton h2;
    private JButton h1;
    private JButton spielerZug;
    private JButton turmR;
    private JButton springerR;
    private JButton laeuferR;
    private JButton koeniginR;
    private JLabel figurR;
    private JLabel platzHalter;
    private boolean[][] spielfeld;
    private boolean starter = false;
    private boolean starter2 = false;
    private static String[][] felderPosition = {
            {"a8","b8","c8","d8","e8","f8","g8","h8"},
            {"a7","b7","c7","d7","e7","f7","g7","h7"},
            {"a6","b6","c6","d6","e6","f6","g6","h6"},
            {"a5","b5","c5","d5","e5","f5","g5","h5"},
            {"a4","b4","c4","d4","e4","f4","g4","h4"},
            {"a3","b3","c3","d3","e3","f3","g3","h3"},
            {"a2","b2","c2","d2","e2","f2","g2","h2"},
            {"a1","b1","c1","d1","e1","f1","g1","h1"}
                                        };
    private String[][] sP; //Schachbrett Position
    private String buttonFeld = "";
    private int xx = 0;
    private int yy = 0;
    private int xz = 0;
    private int yz = 0;
    private boolean feldFarbe = false;
    private boolean[][] antiSkipper = new boolean[8][8];
    private int gerade = 0;
    private String[][] bauerRueckgabe = {
            {"0", "0"},
            {"0", "0"}
    };
    private int[] rocha = new int[6];

    //Initialisiert das Spielfeld für den Spielbeginn
    private void spielfeldInitialisieren () {
        //Platziere die Figuren nach dem Standard Layout
        spielfeld = new boolean[8][8];
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 7; j++) {
                spielfeld[i][j] = true;
            }
        }
        for (int i = 6; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                spielfeld[i][j] = true;
            }
        }
        sP = new String[][]{
                {"turm_s", "springer_s", "laeufer_s", "koenigin_s", "koenig_s", "laeufer_s", "springer_s", "turm_s"},
                {"bauer_s", "bauer_s", "bauer_s", "bauer_s", "bauer_s", "bauer_s", "bauer_s", "bauer_s"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0"},
                {"bauer_w", "bauer_w", "bauer_w", "bauer_w", "bauer_w", "bauer_w", "bauer_w", "bauer_w"},
                {"turm_w", "springer_w", "laeufer_w", "koenigin_w", "koenig_w", "laeufer_w", "springer_w", "turm_w"}
        };
        //lade die Icons
        loadIcon (a8, "/resources/turm_s.png");
        loadIcon (b8, "/resources/springer_s.png");
        loadIcon (c8, "/resources/laeufer_s.png");
        loadIcon (d8, "/resources/koenigin_s.png");
        loadIcon (e8, "/resources/koenig_s.png");
        loadIcon (f8, "/resources/laeufer_s.png");
        loadIcon (g8, "/resources/springer_s.png");
        loadIcon (h8, "/resources/turm_s.png");
        loadIcon (a7, "/resources/bauer_s.png");
        loadIcon (b7, "/resources/bauer_s.png");
        loadIcon (c7, "/resources/bauer_s.png");
        loadIcon (d7, "/resources/bauer_s.png");
        loadIcon (e7, "/resources/bauer_s.png");
        loadIcon (f7, "/resources/bauer_s.png");
        loadIcon (g7, "/resources/bauer_s.png");
        loadIcon (h7, "/resources/bauer_s.png");
        loadIcon (a2, "/resources/bauer_w.png");
        loadIcon (b2, "/resources/bauer_w.png");
        loadIcon (c2, "/resources/bauer_w.png");
        loadIcon (d2, "/resources/bauer_w.png");
        loadIcon (e2, "/resources/bauer_w.png");
        loadIcon (f2, "/resources/bauer_w.png");
        loadIcon (g2, "/resources/bauer_w.png");
        loadIcon (h2, "/resources/bauer_w.png");
        loadIcon (a1, "/resources/turm_w.png");
        loadIcon (b1, "/resources/springer_w.png");
        loadIcon (c1, "/resources/laeufer_w.png");
        loadIcon (d1, "/resources/koenigin_w.png");
        loadIcon (e1, "/resources/koenig_w.png");
        loadIcon (f1, "/resources/laeufer_w.png");
        loadIcon (g1, "/resources/springer_w.png");
        loadIcon (h1, "/resources/turm_w.png");
    }

    //damit das Laden von Icons funktioniert
    private void loadIcon (JButton button, String path) {
        Icon icon = new ImageIcon(getClass().getResource(path));
                button.setIcon(icon);
    }

    //Stellt die Farben des Schachtbretts wieder her
    private void neutralisiereBrett () {
        a8.setBackground(Color.white);
        a7.setBackground(Color.black);
        a6.setBackground(Color.white);
        a5.setBackground(Color.black);
        a4.setBackground(Color.white);
        a3.setBackground(Color.black);
        a2.setBackground(Color.white);
        a1.setBackground(Color.black);
        b8.setBackground(Color.black);
        b7.setBackground(Color.white);
        b6.setBackground(Color.black);
        b5.setBackground(Color.white);
        b4.setBackground(Color.black);
        b3.setBackground(Color.white);
        b2.setBackground(Color.black);
        b1.setBackground(Color.white);
        c8.setBackground(Color.white);
        c7.setBackground(Color.black);
        c6.setBackground(Color.white);
        c5.setBackground(Color.black);
        c4.setBackground(Color.white);
        c3.setBackground(Color.black);
        c2.setBackground(Color.white);
        c1.setBackground(Color.black);
        d8.setBackground(Color.black);
        d7.setBackground(Color.white);
        d6.setBackground(Color.black);
        d5.setBackground(Color.white);
        d4.setBackground(Color.black);
        d3.setBackground(Color.white);
        d2.setBackground(Color.black);
        d1.setBackground(Color.white);
        e8.setBackground(Color.white);
        e7.setBackground(Color.black);
        e6.setBackground(Color.white);
        e5.setBackground(Color.black);
        e4.setBackground(Color.white);
        e3.setBackground(Color.black);
        e2.setBackground(Color.white);
        e1.setBackground(Color.black);
        f8.setBackground(Color.black);
        f7.setBackground(Color.white);
        f6.setBackground(Color.black);
        f5.setBackground(Color.white);
        f4.setBackground(Color.black);
        f3.setBackground(Color.white);
        f2.setBackground(Color.black);
        f1.setBackground(Color.white);
        g8.setBackground(Color.white);
        g7.setBackground(Color.black);
        g6.setBackground(Color.white);
        g5.setBackground(Color.black);
        g4.setBackground(Color.white);
        g3.setBackground(Color.black);
        g2.setBackground(Color.white);
        g1.setBackground(Color.black);
        h8.setBackground(Color.black);
        h7.setBackground(Color.white);
        h6.setBackground(Color.black);
        h5.setBackground(Color.white);
        h4.setBackground(Color.black);
        h3.setBackground(Color.white);
        h2.setBackground(Color.black);
        h1.setBackground(Color.white);
    }

    //lade das passende Icon
    private void ladeIcon(String figur, int x, int y) {
        String pfad = "";
        switch (figur) {

            case "bauer_w":
                pfad = "/resources/bauer_w.png";
                break;

            case "bauer_s":
                pfad = "/resources/bauer_s.png";
                break;

            case "turm_w":
                pfad = "/resources/turm_w.png";
                break;

            case "turm_s":
                pfad = "/resources/turm_s.png";
                break;

            case "springer_w":
                pfad = "/resources/springer_w.png";
                break;

            case "springer_s":
                pfad = "/resources/springer_s.png";
                break;

            case "laeufer_w":
                pfad = "/resources/laeufer_w.png";
                break;

            case "laeufer_s":
                pfad = "/resources/laeufer_s.png";
                break;

            case "koenigin_w":
                pfad = "/resources/koenigin_w.png";
                break;

            case "koenigin_s":
                pfad = "/resources/koenigin_s.png";
                break;

            case "koenig_w":
                pfad = "/resources/koenig_w.png";
                break;

            case "koenig_s":
                pfad = "/resources/koenig_s.png";
                break;

            default:
                System.out.println("Figur nicht bekannt.");
        }
        //A
        if (x == 7 && y == 0) loadIcon(a1, pfad);
        else if (x == 6 && y == 0) loadIcon(a2, pfad);
        else if (x == 5 && y == 0) loadIcon(a3, pfad);
        else if (x == 4 && y == 0) loadIcon(a4, pfad);
        else if (x == 3 && y == 0) loadIcon(a5, pfad);
        else if (x == 2 && y == 0) loadIcon(a6, pfad);
        else if (x == 1 && y == 0) loadIcon(a7, pfad);
        else if (x == 0 && y == 0) loadIcon(a8, pfad);
        //B
        else if (x == 7 && y == 1) loadIcon(b1, pfad);
        else if (x == 6 && y == 1) loadIcon(b2, pfad);
        else if (x == 5 && y == 1) loadIcon(b3, pfad);
        else if (x == 4 && y == 1) loadIcon(b4, pfad);
        else if (x == 3 && y == 1) loadIcon(b5, pfad);
        else if (x == 2 && y == 1) loadIcon(b6, pfad);
        else if (x == 1 && y == 1) loadIcon(b7, pfad);
        else if (x == 0 && y == 1) loadIcon(b8, pfad);
        //C
        else if (x == 7 && y == 2) loadIcon(c1, pfad);
        else if (x == 6 && y == 2) loadIcon(c2, pfad);
        else if (x == 5 && y == 2) loadIcon(c3, pfad);
        else if (x == 4 && y == 2) loadIcon(c4, pfad);
        else if (x == 3 && y == 2) loadIcon(c5, pfad);
        else if (x == 2 && y == 2) loadIcon(c6, pfad);
        else if (x == 1 && y == 2) loadIcon(c7, pfad);
        else if (x == 0 && y == 2) loadIcon(c8, pfad);
        //D
        else if (x == 7 && y == 3) loadIcon(d1, pfad);
        else if (x == 6 && y == 3) loadIcon(d2, pfad);
        else if (x == 5 && y == 3) loadIcon(d3, pfad);
        else if (x == 4 && y == 3) loadIcon(d4, pfad);
        else if (x == 3 && y == 3) loadIcon(d5, pfad);
        else if (x == 2 && y == 3) loadIcon(d6, pfad);
        else if (x == 1 && y == 3) loadIcon(d7, pfad);
        else if (x == 0 && y == 3) loadIcon(d8, pfad);
        //E
        else if (x == 7 && y == 4) loadIcon(e1, pfad);
        else if (x == 6 && y == 4) loadIcon(e2, pfad);
        else if (x == 5 && y == 4) loadIcon(e3, pfad);
        else if (x == 4 && y == 4) loadIcon(e4, pfad);
        else if (x == 3 && y == 4) loadIcon(e5, pfad);
        else if (x == 2 && y == 4) loadIcon(e6, pfad);
        else if (x == 1 && y == 4) loadIcon(e7, pfad);
        else if (x == 0 && y == 4) loadIcon(e8, pfad);
        //F
        else if (x == 7 && y == 5) loadIcon(f1, pfad);
        else if (x == 6 && y == 5) loadIcon(f2, pfad);
        else if (x == 5 && y == 5) loadIcon(f3, pfad);
        else if (x == 4 && y == 5) loadIcon(f4, pfad);
        else if (x == 3 && y == 5) loadIcon(f5, pfad);
        else if (x == 2 && y == 5) loadIcon(f6, pfad);
        else if (x == 1 && y == 5) loadIcon(f7, pfad);
        else if (x == 0 && y == 5) loadIcon(f8, pfad);
        //G
        else if (x == 7 && y == 6) loadIcon(g1, pfad);
        else if (x == 6 && y == 6) loadIcon(g2, pfad);
        else if (x == 5 && y == 6) loadIcon(g3, pfad);
        else if (x == 4 && y == 6) loadIcon(g4, pfad);
        else if (x == 3 && y == 6) loadIcon(g5, pfad);
        else if (x == 2 && y == 6) loadIcon(g6, pfad);
        else if (x == 1 && y == 6) loadIcon(g7, pfad);
        else if (x == 0 && y == 6) loadIcon(g8, pfad);
        //H
        else if (x == 7 && y == 7) loadIcon(h1, pfad);
        else if (x == 6 && y == 7) loadIcon(h2, pfad);
        else if (x == 5 && y == 7) loadIcon(h3, pfad);
        else if (x == 4 && y == 7) loadIcon(h4, pfad);
        else if (x == 3 && y == 7) loadIcon(h5, pfad);
        else if (x == 2 && y == 7) loadIcon(h6, pfad);
        else if (x == 1 && y == 7) loadIcon(h7, pfad);
        else if (x == 0 && y == 7) loadIcon(h8, pfad);
    }

    //löscht das letzte Icon, auf dem sich die Figur befand
    private void loescheIcon (int x, int y) {
        //A
        if (x == 7 && y == 0) a1.setIcon(null);
        else if (x == 6 && y == 0) a2.setIcon(null);
        else if (x == 5 && y == 0) a3.setIcon(null);
        else if (x == 4 && y == 0) a4.setIcon(null);
        else if (x == 3 && y == 0) a5.setIcon(null);
        else if (x == 2 && y == 0) a6.setIcon(null);
        else if (x == 1 && y == 0) a7.setIcon(null);
        else if (x == 0 && y == 0) a8.setIcon(null);
        //B
        else if (x == 7 && y == 1) b1.setIcon(null);
        else if (x == 6 && y == 1) b2.setIcon(null);
        else if (x == 5 && y == 1) b3.setIcon(null);
        else if (x == 4 && y == 1) b4.setIcon(null);
        else if (x == 3 && y == 1) b5.setIcon(null);
        else if (x == 2 && y == 1) b6.setIcon(null);
        else if (x == 1 && y == 1) b7.setIcon(null);
        else if (x == 0 && y == 1) b8.setIcon(null);
        //C
        else if (x == 7 && y == 2) c1.setIcon(null);
        else if (x == 6 && y == 2) c2.setIcon(null);
        else if (x == 5 && y == 2) c3.setIcon(null);
        else if (x == 4 && y == 2) c4.setIcon(null);
        else if (x == 3 && y == 2) c5.setIcon(null);
        else if (x == 2 && y == 2) c6.setIcon(null);
        else if (x == 1 && y == 2) c7.setIcon(null);
        else if (x == 0 && y == 2) c8.setIcon(null);
        //D
        else if (x == 7 && y == 3) d1.setIcon(null);
        else if (x == 6 && y == 3) d2.setIcon(null);
        else if (x == 5 && y == 3) d3.setIcon(null);
        else if (x == 4 && y == 3) d4.setIcon(null);
        else if (x == 3 && y == 3) d5.setIcon(null);
        else if (x == 2 && y == 3) d6.setIcon(null);
        else if (x == 1 && y == 3) d7.setIcon(null);
        else if (x == 0 && y == 3) d8.setIcon(null);
        //E
        else if (x == 7 && y == 4) e1.setIcon(null);
        else if (x == 6 && y == 4) e2.setIcon(null);
        else if (x == 5 && y == 4) e3.setIcon(null);
        else if (x == 4 && y == 4) e4.setIcon(null);
        else if (x == 3 && y == 4) e5.setIcon(null);
        else if (x == 2 && y == 4) e6.setIcon(null);
        else if (x == 1 && y == 4) e7.setIcon(null);
        else if (x == 0 && y == 4) e8.setIcon(null);
        //F
        else if (x == 7 && y == 5) f1.setIcon(null);
        else if (x == 6 && y == 5) f2.setIcon(null);
        else if (x == 5 && y == 5) f3.setIcon(null);
        else if (x == 4 && y == 5) f4.setIcon(null);
        else if (x == 3 && y == 5) f5.setIcon(null);
        else if (x == 2 && y == 5) f6.setIcon(null);
        else if (x == 1 && y == 5) f7.setIcon(null);
        else if (x == 0 && y == 5) f8.setIcon(null);
        //G
        else if (x == 7 && y == 6) g1.setIcon(null);
        else if (x == 6 && y == 6) g2.setIcon(null);
        else if (x == 5 && y == 6) g3.setIcon(null);
        else if (x == 4 && y == 6) g4.setIcon(null);
        else if (x == 3 && y == 6) g5.setIcon(null);
        else if (x == 2 && y == 6) g6.setIcon(null);
        else if (x == 1 && y == 6) g7.setIcon(null);
        else if (x == 0 && y == 6) g8.setIcon(null);
        //H
        else if (x == 7 && y == 7) h1.setIcon(null);
        else if (x == 6 && y == 7) h2.setIcon(null);
        else if (x == 5 && y == 7) h3.setIcon(null);
        else if (x == 4 && y == 7) h4.setIcon(null);
        else if (x == 3 && y == 7) h5.setIcon(null);
        else if (x == 2 && y == 7) h6.setIcon(null);
        else if (x == 1 && y == 7) h7.setIcon(null);
        else if (x == 0 && y == 7) h8.setIcon(null);
    }

    //entfernt die Icons auf dem Spielfeld
    private void entferneIcons () {
        a6.setIcon(null);
        a5.setIcon(null);
        a4.setIcon(null);
        a3.setIcon(null);
        b6.setIcon(null);
        b5.setIcon(null);
        b4.setIcon(null);
        b3.setIcon(null);
        c6.setIcon(null);
        c5.setIcon(null);
        c4.setIcon(null);
        c3.setIcon(null);
        d6.setIcon(null);
        d5.setIcon(null);
        d4.setIcon(null);
        d3.setIcon(null);
        e6.setIcon(null);
        e5.setIcon(null);
        e4.setIcon(null);
        e3.setIcon(null);
        f6.setIcon(null);
        f5.setIcon(null);
        f4.setIcon(null);
        f3.setIcon(null);
        g6.setIcon(null);
        g5.setIcon(null);
        g4.setIcon(null);
        g3.setIcon(null);
        h6.setIcon(null);
        h5.setIcon(null);
        h4.setIcon(null);
        h3.setIcon(null);
    }

    //ueberprüft, was für eine Figur auf dem Feld steht und gibt die jeweilige Figur zurück
    private String feldUeberpuefen (int x, int y) {
        switch (sP[x][y]) {
            case "bauer_s":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht Bauer schwarz.");
                return "bauer_s";
            case "bauer_w":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht Bauer weiß.");
                return "bauer_w";
            case "turm_s":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht Turm schwarz.");
                return "turm_s";
            case "turm_w":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht Turm weiß.");
                return "turm_w";
            case "springer_s":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht Springer schwarz.");
                return "springer_s";
            case "springer_w":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht Springer weiß.");
                return "springer_w";
            case "laeufer_s":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht Läufer schwarz.");
                return "laeufer_s";
            case "laeufer_w":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht Läufer weiß.");
                return "laeufer_w";
            case "koenig_s":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht König schwarz.");
                return "koenig_s";
            case "koenig_w":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht König weiß.");
                return "koenig_w";
            case "koenigin_s":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht Königin schwarz.");
                return "koenigin_s";
            case "koenigin_w":
                //JOptionPane.showMessageDialog(null, "Auf dem Feld steht Königin weiß.");
                return "koenigin_w";
            default:
                JOptionPane.showMessageDialog(null, "Figur nicht bekannt.");
                break;
        }
        return null;
    }

    //Färbt das Feld ein
    private void feldFaerben (int x, int y, char f) {
        //A
        if (x == 7 && y == 0 && f == 'g') a1.setBackground(Color.green);
        else if (x == 7 && y == 0 && f == 'r') a1.setBackground(Color.red);
        if (x == 6 && y == 0 && f == 'g') a2.setBackground(Color.green);
        else if (x == 6 && y == 0 && f == 'r') a2.setBackground(Color.red);
        if (x == 5 && y == 0 && f == 'g') a3.setBackground(Color.green);
        else if (x == 5 && y == 0 && f == 'r') a3.setBackground(Color.red);
        if (x == 4 && y == 0 && f == 'g') a4.setBackground(Color.green);
        else if (x == 4 && y == 0 && f == 'r') a4.setBackground(Color.red);
        if (x == 3 && y == 0 && f == 'g') a5.setBackground(Color.green);
        else if (x == 3 && y == 0 && f == 'r') a5.setBackground(Color.red);
        if (x == 2 && y == 0 && f == 'g') a6.setBackground(Color.green);
        else if (x == 2 && y == 0 && f == 'r') a6.setBackground(Color.red);
        if (x == 1 && y == 0 && f == 'g') a7.setBackground(Color.green);
        else if (x == 1 && y == 0 && f == 'r') a7.setBackground(Color.red);
        if (x == 0 && y == 0 && f == 'g') a8.setBackground(Color.green);
        else if (x == 0 && y == 0 && f == 'r') a8.setBackground(Color.red);
        //B
        if (x == 7 && y == 1 && f == 'g') b1.setBackground(Color.green);
        else if (x == 7 && y == 1 && f == 'r') b1.setBackground(Color.red);
        if (x == 6 && y == 1 && f == 'g') b2.setBackground(Color.green);
        else if (x == 6 && y == 1 && f == 'r') b2.setBackground(Color.red);
        if (x == 5 && y == 1 && f == 'g') b3.setBackground(Color.green);
        else if (x == 5 && y == 1 && f == 'r') b3.setBackground(Color.red);
        if (x == 4 && y == 1 && f == 'g') b4.setBackground(Color.green);
        else if (x == 4 && y == 1 && f == 'r') b4.setBackground(Color.red);
        if (x == 3 && y == 1 && f == 'g') b5.setBackground(Color.green);
        else if (x == 3 && y == 1 && f == 'r') b5.setBackground(Color.red);
        if (x == 2 && y == 1 && f == 'g') b6.setBackground(Color.green);
        else if (x == 2 && y == 1 && f == 'r') b6.setBackground(Color.red);
        if (x == 1 && y == 1 && f == 'g') b7.setBackground(Color.green);
        else if (x == 1 && y == 1 && f == 'r') b7.setBackground(Color.red);
        if (x == 0 && y == 1 && f == 'g') b8.setBackground(Color.green);
        else if (x == 0 && y == 1 && f == 'r') b8.setBackground(Color.red);
        //C
        if (x == 7 && y == 2 && f == 'g') c1.setBackground(Color.green);
        else if (x == 7 && y == 2 && f == 'r') c1.setBackground(Color.red);
        if (x == 6 && y == 2 && f == 'g') c2.setBackground(Color.green);
        else if (x == 6 && y == 2 && f == 'r') c2.setBackground(Color.red);
        if (x == 5 && y == 2 && f == 'g') c3.setBackground(Color.green);
        else if (x == 5 && y == 2 && f == 'r') c3.setBackground(Color.red);
        if (x == 4 && y == 2 && f == 'g') c4.setBackground(Color.green);
        else if (x == 4 && y == 2 && f == 'r') c4.setBackground(Color.red);
        if (x == 3 && y == 2 && f == 'g') c5.setBackground(Color.green);
        else if (x == 3 && y == 2 && f == 'r') c5.setBackground(Color.red);
        if (x == 2 && y == 2 && f == 'g') c6.setBackground(Color.green);
        else if (x == 2 && y == 2 && f == 'r') c6.setBackground(Color.red);
        if (x == 1 && y == 2 && f == 'g') c7.setBackground(Color.green);
        else if (x == 1 && y == 2 && f == 'r') c7.setBackground(Color.red);
        if (x == 0 && y == 2 && f == 'g') c8.setBackground(Color.green);
        else if (x == 0 && y == 2 && f == 'r') c8.setBackground(Color.red);
        //D
        if (x == 7 && y == 3 && f == 'g') d1.setBackground(Color.green);
        else if (x == 7 && y == 3 && f == 'r') d1.setBackground(Color.red);
        if (x == 6 && y == 3 && f == 'g') d2.setBackground(Color.green);
        else if (x == 6 && y == 3 && f == 'r') d2.setBackground(Color.red);
        if (x == 5 && y == 3 && f == 'g') d3.setBackground(Color.green);
        else if (x == 5 && y == 3 && f == 'r') d3.setBackground(Color.red);
        if (x == 4 && y == 3 && f == 'g') d4.setBackground(Color.green);
        else if (x == 4 && y == 3 && f == 'r') d4.setBackground(Color.red);
        if (x == 3 && y == 3 && f == 'g') d5.setBackground(Color.green);
        else if (x == 3 && y == 3 && f == 'r') d5.setBackground(Color.red);
        if (x == 2 && y == 3 && f == 'g') d6.setBackground(Color.green);
        else if (x == 2 && y == 3 && f == 'r') d6.setBackground(Color.red);
        if (x == 1 && y == 3 && f == 'g') d7.setBackground(Color.green);
        else if (x == 1 && y == 3 && f == 'r') d7.setBackground(Color.red);
        if (x == 0 && y == 3 && f == 'g') d8.setBackground(Color.green);
        else if (x == 0 && y == 3 && f == 'r') d8.setBackground(Color.red);
        //E
        if (x == 7 && y == 4 && f == 'g') e1.setBackground(Color.green);
        else if (x == 7 && y == 4 && f == 'r') e1.setBackground(Color.red);
        if (x == 6 && y == 4 && f == 'g') e2.setBackground(Color.green);
        else if (x == 6 && y == 4 && f == 'r') e2.setBackground(Color.red);
        if (x == 5 && y == 4 && f == 'g') e3.setBackground(Color.green);
        else if (x == 5 && y == 4 && f == 'r') e3.setBackground(Color.red);
        if (x == 4 && y == 4 && f == 'g') e4.setBackground(Color.green);
        else if (x == 4 && y == 4 && f == 'r') e4.setBackground(Color.red);
        if (x == 3 && y == 4 && f == 'g') e5.setBackground(Color.green);
        else if (x == 3 && y == 4 && f == 'r') e5.setBackground(Color.red);
        if (x == 2 && y == 4 && f == 'g') e6.setBackground(Color.green);
        else if (x == 2 && y == 4 && f == 'r') e6.setBackground(Color.red);
        if (x == 1 && y == 4 && f == 'g') e7.setBackground(Color.green);
        else if (x == 1 && y == 4 && f == 'r') e7.setBackground(Color.red);
        if (x == 0 && y == 4 && f == 'g') e8.setBackground(Color.green);
        else if (x == 0 && y == 4 && f == 'r') e8.setBackground(Color.red);
        //F
        if (x == 7 && y == 5 && f == 'g') f1.setBackground(Color.green);
        else if (x == 7 && y == 5 && f == 'r') f1.setBackground(Color.red);
        if (x == 6 && y == 5 && f == 'g') f2.setBackground(Color.green);
        else if (x == 6 && y == 5 && f == 'r') f2.setBackground(Color.red);
        if (x == 5 && y == 5 && f == 'g') f3.setBackground(Color.green);
        else if (x == 5 && y == 5 && f == 'r') f3.setBackground(Color.red);
        if (x == 4 && y == 5 && f == 'g') f4.setBackground(Color.green);
        else if (x == 4 && y == 5 && f == 'r') f4.setBackground(Color.red);
        if (x == 3 && y == 5 && f == 'g') f5.setBackground(Color.green);
        else if (x == 3 && y == 5 && f == 'r') f5.setBackground(Color.red);
        if (x == 2 && y == 5 && f == 'g') f6.setBackground(Color.green);
        else if (x == 2 && y == 5 && f == 'r') f6.setBackground(Color.red);
        if (x == 1 && y == 5 && f == 'g') f7.setBackground(Color.green);
        else if (x == 1 && y == 5 && f == 'r') f7.setBackground(Color.red);
        if (x == 0 && y == 5 && f == 'g') f8.setBackground(Color.green);
        else if (x == 0 && y == 5 && f == 'r') f8.setBackground(Color.red);
        //G
        if (x == 7 && y == 6 && f == 'g') g1.setBackground(Color.green);
        else if (x == 7 && y == 6 && f == 'r') g1.setBackground(Color.red);
        if (x == 6 && y == 6 && f == 'g') g2.setBackground(Color.green);
        else if (x == 6 && y == 6 && f == 'r') g2.setBackground(Color.red);
        if (x == 5 && y == 6 && f == 'g') g3.setBackground(Color.green);
        else if (x == 5 && y == 6 && f == 'r') g3.setBackground(Color.red);
        if (x == 4 && y == 6 && f == 'g') g4.setBackground(Color.green);
        else if (x == 4 && y == 6 && f == 'r') g4.setBackground(Color.red);
        if (x == 3 && y == 6 && f == 'g') g5.setBackground(Color.green);
        else if (x == 3 && y == 6 && f == 'r') g5.setBackground(Color.red);
        if (x == 2 && y == 6 && f == 'g') g6.setBackground(Color.green);
        else if (x == 2 && y == 6 && f == 'r') g6.setBackground(Color.red);
        if (x == 1 && y == 6 && f == 'g') g7.setBackground(Color.green);
        else if (x == 1 && y == 6 && f == 'r') g7.setBackground(Color.red);
        if (x == 0 && y == 6 && f == 'g') g8.setBackground(Color.green);
        else if (x == 0 && y == 6 && f == 'r') g8.setBackground(Color.red);
        //H
        if (x == 7 && y == 7 && f == 'g') h1.setBackground(Color.green);
        else if (x == 7 && y == 7 && f == 'r') h1.setBackground(Color.red);
        if (x == 6 && y == 7 && f == 'g') h2.setBackground(Color.green);
        else if (x == 6 && y == 7 && f == 'r') h2.setBackground(Color.red);
        if (x == 5 && y == 7 && f == 'g') h3.setBackground(Color.green);
        else if (x == 5 && y == 7 && f == 'r') h3.setBackground(Color.red);
        if (x == 4 && y == 7 && f == 'g') h4.setBackground(Color.green);
        else if (x == 4 && y == 7 && f == 'r') h4.setBackground(Color.red);
        if (x == 3 && y == 7 && f == 'g') h5.setBackground(Color.green);
        else if (x == 3 && y == 7 && f == 'r') h5.setBackground(Color.red);
        if (x == 2 && y == 7 && f == 'g') h6.setBackground(Color.green);
        else if (x == 2 && y == 7 && f == 'r') h6.setBackground(Color.red);
        if (x == 1 && y == 7 && f == 'g') h7.setBackground(Color.green);
        else if (x == 1 && y == 7 && f == 'r') h7.setBackground(Color.red);
        if (x == 0 && y == 7 && f == 'g') h8.setBackground(Color.green);
        else if (x == 0 && y == 7 && f == 'r') h8.setBackground(Color.red);
    }

    //Soll darstellen, welche Farbe am Zug ist
    private void spielerFarbe (boolean f) {
        if (f) {
            spielerZug.setText("SPIELER SCHWARZ AM ZUG");
            spielerZug.setBackground(Color.black);
            spielerZug.setForeground(Color.white);

        } else if (!f) {
            spielerZug.setText("SPIELER WEIẞ AM ZUG");
            spielerZug.setBackground(Color.white);
            spielerZug.setForeground(Color.black);
        }
    }

    //Funktion um abzufragen welche Figur auf dem Feld steht oder welche sich darauf bewegen kann
    private  void bewegungMove (int ab, int bc) {
        if (starter) {
            xz = ab;
            yz = bc;

            if ((gerade % 2) == 0) {
                //Zahl ist Gerade, weiß ist am Zug

                //Wenn Bauer auf das Feld gehen kann oder darauf eine schwarze Figur erledigen kann
                if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("bauer_w") && (sP[xz][yz].equals("0") ||!sP[xz][yz].equals("0") && !sP[xz][yz].contains("_w"))) {
                    bewegungZug("bauer_w");
                    figurAbfrage("_w");
                    if (!starter2) {
                        spielerFarbe(true);
                        gerade += 1;
                    }
                } //Wenn Turm auf das Feld gehen kann oder darauf eine schwarze Figur erledigen kann
                else if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("turm_w") && (sP[xz][yz].equals("0") ||!sP[xz][yz].equals("0") && !sP[xz][yz].contains("_w"))) {
                    bewegungZug("turm_w");
                    spielerFarbe(true);
                    gerade += 1;
                    if (!sP[7][0].equals("turm_w")) {
                        rocha[0] += 1;
                    }
                    if (!sP[7][7].equals("turm_w")) {
                        rocha[2] += 1;
                    }
                } //Wenn Springer auf das Feld springen kann oder darauf eine schwarze Figur erledigen kann
                else if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("springer_w") && (sP[xz][yz].equals("0") ||!sP[xz][yz].equals("0") && !sP[xz][yz].contains("_w"))) {
                    bewegungZug("springer_w");
                    spielerFarbe(true);
                    gerade += 1;
                }  //Wenn Läufer auf das Feld laufen kann oder darauf eine schwarze Figur erledigen kann
                else if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("laeufer_w") && (sP[xz][yz].equals("0") || !sP[xz][yz].equals("0") && !sP[xz][yz].contains("_w"))) {
                    bewegungZug("laeufer_w");
                    spielerFarbe(true);
                    gerade += 1;
                }  //Wenn Königin auf das Feld gehen kann oder darauf eine schwarze Figur erledigen kann
                else if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("koenigin_w") && (sP[xz][yz].equals("0") || !sP[xz][yz].equals("0") && !sP[xz][yz].contains("_w"))) {
                    bewegungZug("koenigin_w");
                    spielerFarbe(true);
                    gerade += 1;
                } //Wenn König auf das Feld gehen kann oder darauf eine schwarze Figur erledigen kann
                else if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("koenig_w") && (sP[xz][yz].equals("0") || !sP[xz][yz].equals("0") && !sP[xz][yz].contains("_w"))) {
                    bewegungZug("koenig_w");
                    if (xz == 7 && yz == 2 && sP[7][0].equals("turm_w") && rocha[0] < 1 && rocha[1] < 1) {
                        sP[7][0] = "0";
                        sP[7][3] = "turm_w";
                        spielfeld[7][0] = false;
                        spielfeld[7][3] = true;
                        a1.setIcon(null);
                        ladeIcon("turm_w", 7, 3);
                    }
                    if (xz == 7 && yz == 6 && sP[7][7].equals("turm_w") && rocha[2] < 1 && rocha[1] < 1) {
                        sP[7][7] = "0";
                        sP[7][5] = "turm_w";
                        spielfeld[7][7] = false;
                        spielfeld[7][5] = true;
                        h1.setIcon(null);
                        ladeIcon("turm_w", 7, 5);
                    }
                    spielerFarbe(true);
                    gerade += 1;
                    rocha[1] += 1;
                } else if (spielfeld[xz][yz]) {
                    xx = xz;
                    yy = yz;
                    neutralisiereBrett();
                    feldFarbe = false;
                    buttonFeld = feldUeberpuefen(xx, yy);
                    if ("bauer_w".equals(buttonFeld)) {
                        bauerMove('w');
                    } else if ("turm_w".equals(buttonFeld)) {
                        turmMove("_w", xx, yy);
                    } else if ("springer_w".equals(buttonFeld)) {
                        springerMove("_w", xx, yy);
                    } else if ("laeufer_w".equals(buttonFeld)) {
                        laeuferMove("_w", xx, yy);
                    } else if ("koenigin_w".equals(buttonFeld)) {
                        koeniginMove("_w", xx, yy);
                    } else if ("koenig_w".equals(buttonFeld)) {
                        koenigMove("_w", xx, yy);
                    }
                }
            } else if ((gerade % 2) != 0) {
                //Zahl ist ungerade, schwarz ist am Zug

                //Wenn Bauer auf das Feld springen kann oder darauf eine weiße Figur erledigen kann
                if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("bauer_s") && (sP[xz][yz].equals("0") ||!sP[xz][yz].equals("0") && !sP[xz][yz].contains("_s"))) {
                    bewegungZug("bauer_s");
                    figurAbfrage("_s");
                    if (!starter2) {
                        spielerFarbe(false);
                        gerade += 1;
                    }
                }  //Wenn Turm auf das Feld gehen kann oder darauf eine weiße Figur erledigen kann
                else if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("turm_s") && (sP[xz][yz].equals("0") ||!sP[xz][yz].equals("0") && !sP[xz][yz].contains("_s"))) {
                    bewegungZug("turm_s");
                    spielerFarbe(false);
                    gerade += 1;
                    if (!sP[0][0].equals("turm_s")) {
                        rocha[3] += 1;
                    }
                    if (!sP[0][7].equals("turm_s")) {
                        rocha[5] += 1;
                    }
                } //Wenn Springer auf das Feld springen kann oder darauf eine weiße Figur erledigen kann
                else if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("springer_s") && (sP[xz][yz].equals("0") ||!sP[xz][yz].equals("0") && !sP[xz][yz].contains("_s"))) {
                    bewegungZug("springer_s");
                    spielerFarbe(false);
                    gerade += 1;
                }  //Wenn Läufer auf das Feld laufen kann oder darauf eine weiße Figur erledigen kann
                else if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("laeufer_s") && (sP[xz][yz].equals("0") || !sP[xz][yz].equals("0") && !sP[xz][yz].contains("_s"))) {
                    bewegungZug("laeufer_s");
                    spielerFarbe(false);
                    gerade += 1;
                }  //Wenn Königin auf das Feld gehen kann oder darauf eine weiße Figur erledigen kann
                else if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("koenigin_s") && (sP[xz][yz].equals("0") || !sP[xz][yz].equals("0") && !sP[xz][yz].contains("_s"))) {
                    bewegungZug("koenigin_s");
                    spielerFarbe(false);
                    gerade += 1;
                }  //Wenn König auf das Feld gehen kann oder darauf eine weiße Figur erledigen kann
                else if (feldFarbe && antiSkipper[xz][yz] && sP[xx][yy].equals("koenig_s") && (sP[xz][yz].equals("0") || !sP[xz][yz].equals("0") && !sP[xz][yz].contains("_s"))) {
                    bewegungZug("koenig_s");
                    if (xz == 0 && yz == 2 && sP[0][0].equals("turm_s") && rocha[3] < 1 && rocha[4] < 1) {
                        sP[0][0] = "0";
                        sP[0][3] = "turm_s";
                        spielfeld[0][0] = false;
                        spielfeld[0][3] = true;
                        a8.setIcon(null);
                        ladeIcon("turm_s", 0, 3);
                    }
                    if (xz == 0 && yz == 6 && sP[0][7].equals("turm_s") && rocha[5] < 1 && rocha[4] < 1) {
                        sP[0][7] = "0";
                        sP[0][5] = "turm_s";
                        spielfeld[0][7] = false;
                        spielfeld[0][5] = true;
                        h8.setIcon(null);
                        ladeIcon("turm_s", 0, 5);
                    }
                    spielerFarbe(false);
                    gerade += 1;
                    rocha[4] += 1;
                } else if (spielfeld[xz][yz]) {
                    xx = xz;
                    yy = yz;
                    neutralisiereBrett();
                    feldFarbe = false;
                    buttonFeld = feldUeberpuefen(xx, yy);
                    if ("bauer_s".equals(buttonFeld)) {
                        bauerMove('s');
                    } else if ("turm_s".equals(buttonFeld)) {
                        turmMove("_s", xx, yy);
                    } else if ("springer_s".equals(buttonFeld)) {
                        springerMove("_s", xx, yy);
                    } else if ("laeufer_s".equals(buttonFeld)) {
                        laeuferMove("_s", xx, yy);
                    } else if ("koenigin_s".equals(buttonFeld)) {
                        koeniginMove("_s", xx, yy);
                    } else if ("koenig_s".equals(buttonFeld)) {
                        koenigMove("_s", xx, yy);
                    }
                }
            }
            schachMatt();
        }
    }

    //Funktion wenn auf ein farbiges Feld geklickt wird
    private void bewegungZug (String figur) {
        if (!sP[xz][yz].equals("0")) {
            loescheIcon(xz, yz);
        }
        ladeIcon(figur, xz, yz);
        loescheIcon(xx, yy);
        neutralisiereBrett();
        feldFarbe = false;
        spielfeld[xx][yy] = false;
        spielfeld[xz][yz] = true;
        sP[xx][yy] = "0";
        sP[xz][yz] = buttonFeld;
    }

    //Wenn Bauer das letzte gegenüberliegende Feld erreicht
    private void figurAbfrage (String farbeFigur) {
        int turm = 0;
        int springer = 0;
        int laeufer = 0;
        int koenigin = 0;

        if (farbeFigur.contains("_w")) {
            if (xz == 0) {
                for (int i = 0; i <= 7; i++) {
                    for (int j = 0; j <= 7; j++) {
                        if (sP[i][j].contains("turm_w")) turm += 1;
                        if (sP[i][j].contains("springer_w")) springer += 1;
                        if (sP[i][j].contains("laeufer_w")) laeufer += 1;
                        if (sP[i][j].contains("koenigin_w")) koenigin += 1;
                    }
                }

                if (turm < 2) {
                    turmR.setEnabled(true);
                    turmR.setBackground(Color.white);
                    loadIcon(turmR, "/resources/turm_w.png");
                    bauerRueckgabe[0][0] = "turm_w";
                }
                if (springer < 2) {
                    springerR.setEnabled(true);
                    springerR.setBackground(Color.white);
                    loadIcon(springerR, "/resources/springer_w.png");
                    bauerRueckgabe[0][1] = "springer_w";
                }
                if (laeufer < 2) {
                    laeuferR.setEnabled(true);
                    laeuferR.setBackground(Color.white);
                    loadIcon(laeuferR, "/resources/laeufer_w.png");
                    bauerRueckgabe[1][0] = "laeufer_w";
                }
                if (koenigin < 1) {
                    koeniginR.setEnabled(true);
                    koeniginR.setBackground(Color.white);
                    loadIcon(koeniginR, "/resources/koenigin_w.png");
                    bauerRueckgabe[1][1] = "koenigin_w";
                }
                if (turm < 2 || springer < 2 || laeufer < 2 || koenigin < 1) {
                    figurR.setEnabled(true);
                    starter = false;
                    starter2 = true;
                }
            }
        } else if (farbeFigur.contains("_s")) {
            if (xz == 7) {
                for (int i = 0; i <= 7; i++) {
                    for (int j = 0; j <= 7; j++) {
                        if (sP[i][j].contains("turm_s")) turm += 1;
                        if (sP[i][j].contains("springer_s")) springer += 1;
                        if (sP[i][j].contains("laeufer_s")) laeufer += 1;
                        if (sP[i][j].contains("koenigin_s")) koenigin += 1;
                    }
                }

                if (turm < 2) {
                    turmR.setEnabled(true);
                    turmR.setBackground(Color.black);
                    loadIcon(turmR, "/resources/turm_s.png");
                    bauerRueckgabe[0][0] = "turm_s";
                }
                if (springer < 2) {
                    springerR.setEnabled(true);
                    springerR.setBackground(Color.black);
                    loadIcon(springerR, "/resources/springer_s.png");
                    bauerRueckgabe[0][1] = "springer_s";
                }
                if (laeufer < 2) {
                    laeuferR.setEnabled(true);
                    laeuferR.setBackground(Color.black);
                    loadIcon(laeuferR, "/resources/laeufer_s.png");
                    bauerRueckgabe[1][0] = "laeufer_s";
                }
                if (koenigin < 1) {
                    koeniginR.setEnabled(true);
                    koeniginR.setBackground(Color.black);
                    loadIcon(koeniginR, "/resources/koenigin_s.png");
                    bauerRueckgabe[1][1] = "koenigin_s";
                }
                if (turm < 2 || springer < 2 || laeufer < 2 || koenigin < 1) {
                    figurR.setEnabled(true);
                    starter = false;
                    starter2 = true;
                }
            }
        }
    }

    //Wenn eine Figur zurückgegeben werden kann
    private void figurRueckgabe (String figur) {
        String farbe = "";
        boolean spielfeldfarbe = false;

        if (sP[xz][yz].contains("_w")) {
            farbe = "_w";
            spielfeldfarbe = true;
        }
        else  if (sP[xz][yz].contains("_s")) {
            farbe = "_s";
            spielfeldfarbe = false;
        }


        if (figur.equals("turm")) {
            sP[xz][yz] = bauerRueckgabe[0][0];
            ladeIcon("turm" + farbe, xz, yz);
            neutralisiereRueckgabe();
            spielerFarbe(spielfeldfarbe);
        } else if (figur.equals("springer")) {
            sP[xz][yz] = bauerRueckgabe[0][1];
            ladeIcon("springer" + farbe, xz, yz);
           neutralisiereRueckgabe();
           spielerFarbe(spielfeldfarbe);
        } else if (figur.equals("laeufer")) {
            sP[xz][yz] = bauerRueckgabe[1][0];
            ladeIcon("laeufer" + farbe, xz, yz);
            neutralisiereRueckgabe();
            spielerFarbe(spielfeldfarbe);
        } else if (figur.equals("koenigin")) {
            sP[xz][yz] = bauerRueckgabe[1][1];
            ladeIcon("koenigin" + farbe, xz, yz);
            neutralisiereRueckgabe();
            spielerFarbe(spielfeldfarbe);
        }
    }

    //Wenn Figur zurückgegeben sollen die Buttons wieder deaktiviert werden
    private void neutralisiereRueckgabe () {
        figurR.setEnabled(false);
        turmR.setIcon(null);
        turmR.setBackground(Color.white);
        turmR.setEnabled(false);
        springerR.setIcon(null);
        springerR.setBackground(Color.white);
        springerR.setEnabled(false);
        laeuferR.setIcon(null);
        laeuferR.setBackground(Color.white);
        laeuferR.setEnabled(false);
        koeniginR.setIcon(null);
        koeniginR.setBackground(Color.white);
        koeniginR.setEnabled(false);
        starter2 = false;
        starter = true;
        gerade += 1;
    }

    //Bewegungen für den Bauer, f steht für die Farbe des Bauern
    private void bauerMove (char f) {
        antiSkipper = new boolean[8][8];
        int x = xx;
        int y = yy;
        String farbe;
        if (f == 'w') {
            farbe = "_w";

            //Wenn Bauer auf Startposition
            if (x == 6) {
                for (int i = 5; i >= 4; i--) {
                    if (sP[i][y].equals("0")) {
                        feldFaerben(i, y, 'g');
                        feldFarbe = true;
                        antiSkipper[i][y] = true;
                    }
                }
            }

            if (x >= 1) {
                x -= 1;
                if (sP[x][y].equals("0")) {
                    feldFaerben(x, y, 'g');
                    feldFarbe = true;
                    antiSkipper[x][y] = true;
                }
                y -= 1;
                if (y >= 0 && y <= 7 && !sP[x][y].equals("0") && !sP[x][y].contains(farbe)) {
                    feldFaerben(x, y, 'r');
                    feldFarbe = true;
                    antiSkipper[x][y] = true;
                }
                y += 2;
                if (y >= 0 && y <= 7 && !sP[x][y].equals("0") && !sP[x][y].contains(farbe)) {
                    feldFaerben(x, y, 'r');
                    feldFarbe = true;
                    antiSkipper[x][y] = true;
                }
            }

            if (x == 0) {
                figurAbfrage("_w");
            }
        } else if (f == 's') {
            farbe = "_s";

            //Wenn Bauer auf Startposition
            if (x == 1) {
                for (int i = 2; i <= 3; i++) {
                    if (sP[i][y].equals("0")) {
                        feldFaerben(i, y, 'g');
                        feldFarbe = true;
                        antiSkipper[i][y] = true;
                    }
                }
            }

            if (x <= 6) {
                x += 1;
                if (sP[x][y].equals("0")) {
                    feldFaerben(x, y, 'g');
                    feldFarbe = true;
                    antiSkipper[x][y] = true;
                }
                y -= 1;
                if (y >= 0 && y <= 7 && !sP[x][y].equals("0") && !sP[x][y].contains(farbe)) {
                    feldFaerben(x, y, 'r');
                    feldFarbe = true;
                    antiSkipper[x][y] = true;
                }
                y += 2;
                if (y >= 0 && y <= 7 && !sP[x][y].equals("0") && !sP[x][y].contains(farbe)) {
                    feldFaerben(x, y, 'r');
                    feldFarbe = true;
                    antiSkipper[x][y] = true;
                }
            }

            if (x == 7) {
                figurAbfrage("_s");
            }
        }
        }

    //Bewegungen für den Turm, f steht für die Farbe des Turms
    private void turmMove (String f, int x, int y) {
        antiSkipper = new boolean [8][8];
        x = x - 1; // Setzt x auf eine Position über dem aktuellen Feld
            for (int i = x; i >= 0; i--) {
                if (sP[i][y].equals("0")) {
                    feldFaerben(i, y, 'g');
                    feldFarbe = true;
                    antiSkipper[i][y] = true;
                } else if (!sP[i][y].equals("0") && !sP[i][y].contains(f)) {
                    feldFaerben(i, y, 'r');
                    feldFarbe = true;
                    antiSkipper[i][y] = true;
                    break;
                } else break;
                // System.out.println("hoch" + i);
            }
        x = x + 2; // Setzt x auf eine Position unter dem aktuellen Feld
            for (int i = x; i <= 7; i++) {
                if (sP[i][y].equals("0")) {
                    feldFaerben(i, y, 'g');
                    feldFarbe = true;
                    antiSkipper[i][y] = true;
                } else if (!sP[i][y].equals("0") && !sP[i][y].contains(f)) {
                    feldFaerben(i, y, 'r');
                    feldFarbe = true;
                    antiSkipper[i][y] = true;
                    break;
                } else break;
               // System.out.println("runter" + i);
            }
        x = x - 1; //Setze x auf die Ursprüngliche Position zurück
        y = y + 1; //Setze y auf eine Position rechts neben dem aktuellen Feld
        for (int i = y; i <= 7; i++) {
            if (sP[x][i].equals("0")) {
                feldFaerben(x, i, 'g');
                feldFarbe = true;
                antiSkipper[x][i] = true;
            } else if (!sP[x][i].equals("0") && !sP[x][i].contains(f)) {
                feldFaerben(x, i, 'r');
                feldFarbe = true;
                antiSkipper[x][i] = true;
                break;
            } else break;
            //System.out.println("rechts" + i);
            }
        y = y - 2; //Setze y auf eine Position links neben dem aktuellen Feld
        for (int i = y; i >= 0; i--) {
            if (sP[x][i].equals("0")) {
                feldFaerben(x, i, 'g');
                feldFarbe = true;
                antiSkipper[x][i] = true;
            } else if (!sP[x][i].equals("0") && !sP[x][i].contains(f)) {
                feldFaerben(x, i, 'r');
                feldFarbe = true;
                antiSkipper[x][i] = true;
                break;
            } else break;
            //System.out.println("links" + i);
            }
        }

    //Bewegungen für den Springer, f steht für die Farbe des Springers
    private void springerMove (String f, int x, int y) {
        antiSkipper = new boolean[8][8];
        x += 1;
        y -= 2;
        springerAbfragen(x, y, f);
        x -= 2;
        springerAbfragen(x, y, f);
        x -= 1;
        y += 1;
        springerAbfragen(x, y, f);
        y += 2;
        springerAbfragen(x, y, f);
        x += 1;
        y += 1;
        springerAbfragen(x, y, f);
        x += 2;
        springerAbfragen(x, y, f);
        x += 1;
        y -= 1;
        springerAbfragen(x, y, f);
        y -= 2;
        springerAbfragen(x, y, f);
    }

    //Unterstützt die Funktion des Springers
    private void springerAbfragen (int a, int b, String f) {
        if (((a >= 0 && b >= 0) && (a <= 7 && b <= 7)) && sP[a][b].equals("0")) {
            feldFaerben (a, b, 'g');
            antiSkipper[a][b] = true;
            feldFarbe = true;
        } else if  (((a >= 0 && b >= 0) && (a <= 7 && b <= 7)) && !sP[a][b].equals("0") && !sP[a][b].contains(f)) {
            feldFaerben (a, b, 'r');
            antiSkipper[a][b] = true;
            feldFarbe = true;
        }
    }

    //Bewegungen für den Läufer, f ist die Farbe
    private void laeuferMove (String f, int x, int y) {
        antiSkipper = new boolean[8][8];
        x -= 1;
        y += 1;
        int j = y;
        if (x >= 0 && y >= 0 && x <= 7 && y <= 7) {
            for (int i = x; i >= 0 && j <= 7; i--, j++) {
                if (sP[i][j].equals("0")) {
                    feldFaerben(i, j, 'g');
                    feldFarbe = true;
                    antiSkipper[i][j] = true;
                } else if (!sP[i][j].equals("0") && !sP[i][j].contains(f)) {
                    feldFaerben(i, j, 'r');
                    feldFarbe = true;
                    antiSkipper[i][j] = true;
                    break;
                } else break;
            }
        }
        x += 2;
        j = y;
        if (x >= 0 && y >= 0 && x <= 7 && y <= 7) {
            for (int i = x; i <= 7 &&  j <= 7; i++, j++) {
                if (sP[i][j].equals("0")) {
                    feldFaerben(i, j, 'g');
                    feldFarbe = true;
                    antiSkipper[i][j] = true;
                } else if (!sP[i][j].equals("0") && !sP[i][j].contains(f)) {
                    feldFaerben(i, j, 'r');
                    feldFarbe = true;
                    antiSkipper[i][j] = true;
                    break;
                } else break;
            }
        }
        y -= 2;
        j = y;
        if (x >= 0 && y >= 0 && x <= 7 && y <= 7) {
            for (int i = x; i <= 7 && j >= 0; i++, j--) {
                if (sP[i][j].equals("0")) {
                    feldFaerben(i, j, 'g');
                    feldFarbe = true;
                    antiSkipper[i][j] = true;
                } else if (!sP[i][j].equals("0") && !sP[i][j].contains(f)) {
                    feldFaerben(i, j, 'r');
                    feldFarbe = true;
                    antiSkipper[i][j] = true;
                    break;
                } else break;
            }
        }
        x -= 2;
        j = y;
        if (x >= 0 && y >= 0 && x <= 7 && y <= 7) {
            for (int i = x; i >= 0 && j >= 0; i--, j--) {
                if (sP[i][j].equals("0")) {
                    feldFaerben(i, j, 'g');
                    feldFarbe = true;
                    antiSkipper[i][j] = true;
                } else if (!sP[i][j].equals("0") && !sP[i][j].contains(f)) {
                    feldFaerben(i, j, 'r');
                    feldFarbe = true;
                    antiSkipper[i][j] = true;
                    break;
                } else break;
            }
        }
    }

    //Bewegungen für die Königin, f ist die Farbe
    private void koeniginMove (String f, int x, int y) {
        antiSkipper = new boolean[8][8];
        x -= 1;
        y += 1;
        int j = y;
        //rechts-hoch
        for (int i = x; i >= 0 && j <= 7; i--, j++) {
            if (sP[i][j].equals("0")) {
                feldFaerben(i, j, 'g');
                feldFarbe = true;
                antiSkipper[i][j] = true;
            } else if (!sP[i][j].equals("0") && !sP[i][j].contains(f)) {
                feldFaerben(i, j, 'r');
                feldFarbe = true;
                antiSkipper[i][j] = true;
                break;
            } else break;
        }
        x += 1;
        //rechts
        for (int i = y; i <= 7; i++) {
            if (sP[x][i].equals("0")) {
                feldFaerben(x, i, 'g');
                feldFarbe = true;
                antiSkipper[x][i] = true;
            } else if (!sP[x][i].equals("0") && !sP[x][i].contains(f)) {
                feldFaerben(x, i, 'r');
                feldFarbe = true;
                antiSkipper[x][i] = true;
                break;
            } else break;
        }
        x += 1;
        j = y;
        //rechts-runter
        for (int i = x; i <= 7 &&  j <= 7; i++, j++) {
            if (sP[i][j].equals("0")) {
                feldFaerben(i, j, 'g');
                feldFarbe = true;
                antiSkipper[i][j] = true;
            } else if (!sP[i][j].equals("0") && !sP[i][j].contains(f)) {
                feldFaerben(i, j, 'r');
                feldFarbe = true;
                antiSkipper[i][j] = true;
                break;
            } else break;
        }
        y -= 1;
        //runter
        for (int i = x; i <= 7; i++) {
            if (sP[i][y].equals("0")) {
                feldFaerben(i, y, 'g');
                feldFarbe = true;
                antiSkipper[i][y] = true;
            } else if (!sP[i][y].equals("0") && !sP[i][y].contains(f)) {
                feldFaerben(i, y, 'r');
                feldFarbe = true;
                antiSkipper[i][y] = true;
                break;
            } else break;
        }
        y -= 1;
        j = y;
        //links-runter
        for (int i = x; i <= 7 && j >= 0; i++, j--) {
            if (sP[i][j].equals("0")) {
                feldFaerben(i, j, 'g');
                feldFarbe = true;
                antiSkipper[i][j] = true;
            } else if (!sP[i][j].equals("0") && !sP[i][j].contains(f)) {
                feldFaerben(i, j, 'r');
                feldFarbe = true;
                antiSkipper[i][j] = true;
                break;
            } else break;
        }
        x -= 1;
        //links
        for (int i = y; i >= 0; i--) {
            if (sP[x][i].equals("0")) {
                feldFaerben(x, i, 'g');
                feldFarbe = true;
                antiSkipper[x][i] = true;
            } else if (!sP[x][i].equals("0") && !sP[x][i].contains(f)) {
                feldFaerben(x, i, 'r');
                feldFarbe = true;
                antiSkipper[x][i] = true;
                break;
            } else break;
        }
        x -= 1;
        j = y;
        //links-hoch
        for (int i = x; i >= 0 && j >= 0; i--, j--) {
            if (sP[i][j].equals("0")) {
                feldFaerben(i, j, 'g');
                feldFarbe = true;
                antiSkipper[i][j] = true;
            } else if (!sP[i][j].equals("0") && !sP[i][j].contains(f)) {
                feldFaerben(i, j, 'r');
                feldFarbe = true;
                antiSkipper[i][j] = true;
                break;
            } else break;
        }
        y += 1;
        //hoch
        for (int i = x; i >= 0; i--) {
            if (sP[i][y].equals("0")) {
                feldFaerben(i, y, 'g');
                feldFarbe = true;
                antiSkipper[i][y] = true;
            } else if (!sP[i][y].equals("0") && !sP[i][y].contains(f)) {
                feldFaerben(i, y, 'r');
                feldFarbe = true;
                antiSkipper[i][y] = true;
                break;
            } else break;
        }
    }

    //Bewegung für den König, f ist die Farbe
    private void koenigMove (String f, int x, int y) {
        x -= 1;
        koenigAbfrage(f, x, y);
        y += 1;
        koenigAbfrage(f, x, y);
        x += 1;
        koenigAbfrage(f, x, y);
        x += 1;
        koenigAbfrage(f, x, y);
        y -= 1;
        koenigAbfrage(f, x, y);
        y -= 1;
        koenigAbfrage(f, x, y);
        x -= 1;
        koenigAbfrage(f, x, y);
        x -= 1;
        koenigAbfrage(f, x, y);

        //Rochaden sind super und nicht unnötig
        if (f.equals("_w")) {
            if (sP[7][0].equals("turm_w") && sP[7][1].equals("0") && sP[7][2].equals("0") && sP[7][3].equals("0") && sP[7][4].equals("koenig_w") && rocha[0] < 1 && rocha[1] < 1) {
                c1.setBackground(Color.green);
                feldFarbe = true;
                antiSkipper[7][2] = true;
            }
        if (sP[7][7].equals("turm_w") && sP[7][6].equals("0") && sP[7][5].equals("0") && sP[7][4].equals("koenig_w") && rocha[2] < 1 && rocha[1] < 1) {
            g1.setBackground(Color.green);
            feldFarbe = true;
            antiSkipper[7][6] = true;
            }
        }
        if (f.equals("_s")) {
            if (sP[0][0].equals("turm_s") && sP[0][1].equals("0") && sP[0][2].equals("0") && sP[0][3].equals("0") && sP[0][4].equals("koenig_s") && rocha[3] < 1 && rocha[4] < 1) {
                c8.setBackground(Color.green);
                feldFarbe = true;
                antiSkipper[0][2] = true;
            }
            if (sP[0][7].equals("turm_s") && sP[0][6].equals("0") && sP[0][5].equals("0") && sP[0][4].equals("koenig_s") && rocha[5] < 1 && rocha[4] < 1) {
                g8.setBackground(Color.green);
                feldFarbe = true;
                antiSkipper[0][6] = true;
            }
        }
    }

    //Funktion um Code beim König zu sparen
    private void koenigAbfrage (String f, int x, int y) {
        if (x >= 0 && y >= 0 && x <= 7 && y <= 7 && sP[x][y].equals("0")) {
            feldFaerben(x, y, 'g');
            feldFarbe = true;
            antiSkipper[x][y] = true;
        } else if (x >= 0 && y >= 0 && x <= 7 && y <= 7 && !sP[x][y].equals("0") && !sP[x][y].contains(f)) {
            feldFaerben(x, y, 'r');
            feldFarbe = true;
            antiSkipper[x][y] = true;
        }
    }

    //Überprüft nach jedem Zug, ob der König noch existiert
    private void schachMatt () {
        int schwarz = 0;
        int weiss = 0;
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (sP[i][j].equals("koenig_w")) {
                    weiss += 1;
                }
                if (sP[i][j].equals("koenig_s")) {
                    schwarz += 1;
                }
            }
        }
        if (weiss <= 0 || schwarz <= 0) {
            JOptionPane.showMessageDialog(null, "Der gegnerische König wurde geschlagen, das Spiel ist vorbei.");
           starter = false;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Schach ist das BESTE SPIEL DER WELT!!!!1!1");
        ImageIcon icon = new ImageIcon("/resources/icon32.png");
        frame.setIconImage(icon.getImage());
        frame.setContentPane(new Schach_GUI().Schachfeld);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/resources/icon64.png"));
        frame.setVisible(true);
    }

    private Schach_GUI() {

        spielStartenButton.addActionListener(e -> {
            spielfeldInitialisieren();
            neutralisiereBrett();
            entferneIcons();
            starter = true;
            starter2 = false;
            feldFarbe = false;
            gerade = 0;
            spielerFarbe(false);
            for (int i = 0; i < 6; i++) {
                rocha[i] = 0;
            }
        });

        a1.addActionListener(e -> bewegungMove(7, 0));

        a2.addActionListener(e -> bewegungMove(6, 0));

        a3.addActionListener(e -> bewegungMove(5, 0));

        a4.addActionListener(e -> bewegungMove(4, 0));

        a5.addActionListener(e -> bewegungMove(3, 0));

        a6.addActionListener(e -> bewegungMove(2, 0));

        a7.addActionListener(e -> bewegungMove(1, 0));

        a8.addActionListener(e -> bewegungMove(0, 0));

        b1.addActionListener(e -> bewegungMove(7, 1));

        b2.addActionListener(e -> bewegungMove(6, 1));

        b3.addActionListener(e -> bewegungMove(5, 1));

        b4.addActionListener(e -> bewegungMove(4, 1));

        b5.addActionListener(e -> bewegungMove(3, 1));

        b6.addActionListener(e -> bewegungMove(2, 1));

        b7.addActionListener(e -> bewegungMove(1, 1));

        b8.addActionListener(e -> bewegungMove(0, 1));

        c1.addActionListener(e -> bewegungMove(7, 2));

        c2.addActionListener(e -> bewegungMove(6, 2));

        c3.addActionListener(e -> bewegungMove(5, 2));

        c4.addActionListener(e -> bewegungMove(4, 2));

        c5.addActionListener(e -> bewegungMove(3, 2));

        c6.addActionListener(e -> bewegungMove(2, 2));

        c7.addActionListener(e -> bewegungMove(1, 2));

        c8.addActionListener(e -> bewegungMove(0, 2));

        d1.addActionListener(e -> bewegungMove(7, 3));

        d2.addActionListener(e -> bewegungMove(6, 3));

        d3.addActionListener(e -> bewegungMove(5, 3));

        d4.addActionListener(e -> bewegungMove(4, 3));

        d5.addActionListener(e -> bewegungMove(3, 3));

        d6.addActionListener(e -> bewegungMove(2, 3));

        d7.addActionListener(e -> bewegungMove(1, 3));

        d8.addActionListener(e -> bewegungMove(0, 3));

        e1.addActionListener(e -> bewegungMove(7, 4));

        e2.addActionListener(e -> bewegungMove(6, 4));

        e3.addActionListener(e -> bewegungMove(5, 4));

        e4.addActionListener(e -> bewegungMove(4, 4));

        e5.addActionListener(e -> bewegungMove(3, 4));

        e6.addActionListener(e -> bewegungMove(2, 4));

        e7.addActionListener(e -> bewegungMove(1, 4));

        e8.addActionListener(e -> bewegungMove(0, 4));

        f1.addActionListener(e -> bewegungMove(7, 5));

        f2.addActionListener(e -> bewegungMove(6, 5));

        f3.addActionListener(e -> bewegungMove(5, 5));

        f4.addActionListener(e -> bewegungMove(4, 5));

        f5.addActionListener(e -> bewegungMove(3, 5));

        f6.addActionListener(e -> bewegungMove(2, 5));

        f7.addActionListener(e -> bewegungMove(1, 5));

        f8.addActionListener(e -> bewegungMove(0, 5));

        g1.addActionListener(e -> bewegungMove(7, 6));

        g2.addActionListener(e -> bewegungMove(6, 6));

        g3.addActionListener(e -> bewegungMove(5, 6));

        g4.addActionListener(e -> bewegungMove(4, 6));

        g5.addActionListener(e -> bewegungMove(3, 6));

        g6.addActionListener(e -> bewegungMove(2, 6));

        g7.addActionListener(e -> bewegungMove(1, 6));

        g8.addActionListener(e -> bewegungMove(0, 6));

        h1.addActionListener(e -> bewegungMove(7, 7));

        h2.addActionListener(e -> bewegungMove(6, 7));

        h3.addActionListener(e -> bewegungMove(5, 7));

        h4.addActionListener(e -> bewegungMove(4, 7));

        h5.addActionListener(e -> bewegungMove(3, 7));

        h6.addActionListener(e -> bewegungMove(2, 7));

        h7.addActionListener(e -> bewegungMove(1, 7));

        h8.addActionListener(e -> bewegungMove(0, 7));

        turmR.addActionListener(e -> figurRueckgabe("turm"));

        springerR.addActionListener(e -> figurRueckgabe("springer"));

        laeuferR.addActionListener(e -> figurRueckgabe("laeufer"));

        koeniginR.addActionListener(e -> figurRueckgabe("koenigin"));
    }
}