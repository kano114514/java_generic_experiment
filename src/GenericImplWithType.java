/**
 * @author wuhaoyu
 * @date 2024/9/19  上午12:23
 * @description:
 */
public class GenericImplWithType implements GenericInterface<String>{
    @Override
    public void sout(String name) {
        System.out.println("with " + name);
    }
}
