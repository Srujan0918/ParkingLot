package Controller;

import DTOs.*;
import Models.Ticket;
import Services.TicketService;

public class IssueTicketController {
    private TicketService ticketService;
    public IssueTicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public IssueTicketResponeDTO IssueTicket(IssueTicketRequestDTO issueTicketRequestDTO){
        IssueTicketResponeDTO issueTicketResponeDTO = new IssueTicketResponeDTO();
        try{
            Ticket ticket = ticketService.IssueTicket(issueTicketRequestDTO.getVehichlenumber(),
                    issueTicketRequestDTO.getOwnerName(),
                    issueTicketRequestDTO.getGateId(),
                    issueTicketRequestDTO.getOperatorId());
            issueTicketResponeDTO.setTicket(ticket);
            issueTicketResponeDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            issueTicketResponeDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return issueTicketResponeDTO;
    }

    public DeleteTicketResponseDTO DeleteTicket(DeleteTicketRequestDTO deleteTicketRequestDTO){
        return null;
    }
}
