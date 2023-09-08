/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drws.library.swing;

import drws.library.model.Livro;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author drws
 */
public class LivroTableModel extends AbstractTableModel {
    private List<Livro> items;
    private String[] columns = new String[] {"Código", "Título", "Autor", "Gênero"};
    
    public LivroTableModel(List<Livro> items) {
        this.items = items;
    }

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Livro item = items.get(rowIndex);
        switch (columnIndex) {
            case 0: return item.getId();
            case 1: return item.getTitle();
            case 2: return item.getAuthor().getName();
            case 3: return item.getGenre();
            //case 4: return item.getYear();
            //case 5: return item.getPages();
        }
        return null;
    }
    
    public void removeLivro(Livro item) {
        if (items.contains(item)) {
            int row = items.indexOf(item);
            items.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }
    
}
