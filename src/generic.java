/**
 * @author wuhaoyu
 * @date 2024/9/18  下午10:32
 * @description:
 */
public class generic <T>{
    private T name;
    private T location;
    public generic(T name, T location){
        this.name = name;
        this.location = location;
    }
    public T getName(){
        return name;
    }
    public T getLocation(){
        return location;
    }
    static <E> void out(E name){
        System.out.println(name.getClass().getName());
    }
}
