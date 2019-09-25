package secret;

class FamilyMembers {

    private String name;
    private FamilyMembers recipient;
    private FamilyMembers sender;

    protected FamilyMembers(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected boolean hasRecipient() {
        return recipient != null;
    }

    protected String getRecipientName() {
        return recipient.getName();
    }

    protected void setRecipient(FamilyMembers recipient) {
        this.recipient = recipient;
    }

    protected void resetRecipient() {
        this.recipient = null;
    }

    protected boolean hasSender() {
        return sender != null;
    }

    protected void setSender(FamilyMembers sender) {
        this.sender = sender;
    }

    protected void resetSender() {
        this.sender = null;
    }
}
