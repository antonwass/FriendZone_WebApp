package entities;

import javax.persistence.*;

/**
 * Created by Anton on 2016-11-10.
 */
@Entity
@Table(name = "Conversation", schema = "dbo", catalog = "community")
public class ConversationEntity {
    private Integer conversationId;
    private String namn;

    @Id
    @Column(name = "conversation_id", nullable = false)
    public Integer getConversationId() {
        return conversationId;
    }

    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    @Basic
    @Column(name = "namn", nullable = false, length = 64)
    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConversationEntity that = (ConversationEntity) o;

        if (conversationId != null ? !conversationId.equals(that.conversationId) : that.conversationId != null)
            return false;
        if (namn != null ? !namn.equals(that.namn) : that.namn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = conversationId != null ? conversationId.hashCode() : 0;
        result = 31 * result + (namn != null ? namn.hashCode() : 0);
        return result;
    }
}