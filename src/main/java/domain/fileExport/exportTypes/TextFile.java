package domain.fileExport.exportTypes;

import domain.Movie;
import domain.MovieTicket;
import domain.fileExport.IFileBehaviour;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class TextFile implements IFileBehaviour {
    @Override
    public void export(int orderNr, ArrayList<MovieTicket> tickets) {
        String directory = System.getProperty("user.dir");
        String filename = String.format("Order_%s.txt", orderNr);

        try (FileWriter file = new FileWriter(new File(directory + "\\exportedFiles\\", filename))) {
            for (MovieTicket ticket : tickets) {
                file.write(ticket.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
