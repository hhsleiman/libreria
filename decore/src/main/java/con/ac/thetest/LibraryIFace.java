package con.ac.thetest;

import javax.ejb.Remote;

@Remote
public interface LibraryIFace{
    public String getName();
    public void setName(String text);
    public String getText();
    public void setText(String name);
}