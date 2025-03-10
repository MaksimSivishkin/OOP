import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    ArrayList <Line> lines=new ArrayList<>();

    public void AddPolyLine(Line line){
        lines.add(line);
    }

    public List listPolyLine(){  //Конструктор возвращает список длин линий
        ArrayList<Double> lines1=new ArrayList<>();
        double x=0;
        for(Line string : lines){
            x += string.getLine();
            lines1.add(x);
            x=0;
        }
        return lines1;
    }

    public double sumPolyLine(){ //Конструктор возвращает сумму линий из списка
        double sum=0;
        for(Line string : lines){
            sum += string.getLine();
        }
        return sum;
    }


    @Override
    public String toString() {
        return String.format("Линия %s", lines);
    }

}

