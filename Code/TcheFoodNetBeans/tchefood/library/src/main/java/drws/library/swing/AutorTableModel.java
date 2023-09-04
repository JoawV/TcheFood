/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drws.library.swing;

import drws.library.model.Autor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author drws
 */
public class AutorTableModel  extends AbstractTableModel {
    private List<Autor> items;
    private String[] columns = new String[] {"Código", "Nome", "País"};
    
    public AutorTableModel(List<Autor> items) {
        this.items = items;
    }
    
    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Autor item = items.get(rowIndex);
        switch (columnIndex) {
            case 0: return item.getId();
            case 1: return item.getName();
            case 2: return item.getCountry();
        }
        return null;
    }
    
    /*public void removeAutor(Autor item) {
        if (items.contains(item)) {
            int row = items.indexOf(item);
            items.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }*/
    
}
