public class Editor {
    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }
    public void RestoreState(EditorState state){
        content = state.GetContent();
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
