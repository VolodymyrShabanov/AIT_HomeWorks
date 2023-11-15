package home_work_43;

import java.time.LocalDate;

/**
 * Created by Volodymyr Sh on 14.11.2023
 * project name: AIT_HomeWorks
 */
public class Document {
    private final LocalDate name;
    private DocumentState state;

    public Document() {
        this.name = LocalDate.now();
        this.state = DocumentState.DRAFT;
    }

    public void publish() {
        if (state.ordinal() == 0) {
            this.state = DocumentState.PUBLISHED;
            System.out.println("Document has been transferred to the states - PUBLISHER");
        return;
        }
        System.err.println("Document status is not DRAFT.");
    }

    public void deleted() {
        if (state.ordinal() != 2) {
            this.state = DocumentState.DELETED;
            System.out.println("Document has been - DELETE");
            return;
        }

        System.err.println("Document status already DELETED");

    }

    public void correct() {
        if (state.ordinal() == 1) {
            this.state = DocumentState.DRAFT;
            System.out.println("Document has been transferred to the states - DRAFT");
            return;
        }
        System.err.println("Document status is not PUBLISHED");
    }


    public LocalDate getName() {
        return name;
    }

    public DocumentState getState() {
        return state;
    }

}
