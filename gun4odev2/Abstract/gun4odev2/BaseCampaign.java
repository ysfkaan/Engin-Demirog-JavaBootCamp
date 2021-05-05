package gun4odev2;

public abstract class BaseCampaign implements IBaseCampaign {
	
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName + "kampanyası  eklendi");
	}
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName + "kampanyası silindi");
	}
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName + "kampanyası güncellendi ");
	}

}
