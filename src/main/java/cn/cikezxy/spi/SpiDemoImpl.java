package cn.cikezxy.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SpiDemoImpl implements SpiDemoInterface {
    public void printClassName() {
        System.out.println(this.getClass().getName());
    }

    public int getOrder() {
        return 0;
    }

    public static void main(String[] args) {
        ServiceLoader<SpiDemoInterface> demos = ServiceLoader.load(SpiDemoInterface.class);
        Iterator<SpiDemoInterface> iterator = demos.iterator();
        if(iterator.hasNext()){
            iterator.next().printClassName();
        }
    }
}
