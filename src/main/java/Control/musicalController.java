package Control;

import Modelo.instrumentos;
import Modelo.musico;
import java.util.ArrayList;
import java.util.List;

public class musicalController {
    private List<musico> musico=new ArrayList();
    private List<instrumentos> instrumentos =new ArrayList();
    private musico musicomemoria =new musico();
    
      
    public void agregarMusico(musico m){
        getMusico().add(m);      
    } 
    public void agregarInstrumento(instrumentos i){
        getInstrumentos().add(i);
    }
    public musico consultarmusico(String cod){
        musico mu=null;
        for(musico m:getMusico()){
            if(m.getIdentidad().equals(cod)){
                mu=m;break;
            }
        }        
        return mu;
    }  
    public int consultarposicionmusico(String cod){
        int mu = 0;
        for(int i=0; i < this.musico.size(); i++){
            if(this.musico.get(i).getIdentidad().equals(cod)){
                mu=i;break;
            }
        }        
        return mu;
    }  
    public instrumentos consultarinst(String cod){
        instrumentos IN=null;
        for(instrumentos M:getInstrumentos()){
            if(M.getCodigo2().equals(cod)){
                IN=M;break;
            }
        }        
        return IN;
    } 
    public void eliminarMusico(musico m){
        getMusico().remove(m);
    }
    public List<musico> getMusico() {
        return musico;
    }
    public void setMusico(List<musico> musico) {
        this.musico = musico;
    }
    public List<instrumentos> getInstrumentos() {
        return instrumentos;
    }
    public void setInstrumentos(List<instrumentos> instrumentos) {
        this.instrumentos = instrumentos;
    }
    public musico getMusicomemoria() {
        return musicomemoria;
    }
    public void setMusicomemoria(musico musicomemoria) {
        this.musicomemoria = musicomemoria;
    }
    
}
