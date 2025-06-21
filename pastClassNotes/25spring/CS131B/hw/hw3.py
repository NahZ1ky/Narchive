# the country that are permanent members: China, France, Russia, United Kingdom, United States
# infomation from https://en.wikipedia.org/wiki/Permanent_members_of_the_United_Nations_Security_Council#Permanent_members
def popAgainstWorld(population):
    # https://www.worldometers.info/world-population/
    world_pop = 8207.294856 # real time estimation when this program was written
    return population / world_pop * 100

# COUNTRY'S POPULATION (in milions)
# https://en.wikipedia.org/wiki/China#:~:text=2024%20estimate%0A%EF%BF%BC%201%2C408%2C280%2C000
cn_pop = 1408.28  # 2024 estimation
# https://en.wikipedia.org/wiki/France#:~:text=January%202025%20estimate,68%2C605%2C616
fr_pop = 68.605616 # Jan 2025 estimation
# https://en.wikipedia.org/wiki/Russia#:~:text=2024%20estimate,146%2C150%2C789
ru_pop = 146.150789 # 2024 estimate
# https://en.wikipedia.org/wiki/United_Kingdom#:~:text=2023%20estimate,68%2C265%2C209
uk_pop = 68.265209 # 2023 estimate
# https://en.wikipedia.org/wiki/United_States#:~:text=%E2%80%A2-,2024%20estimate,340%2C110%2C988,-%5B11%5D
us_pop = 340.110988 # 2024 estimate

print('there are five permanent members of the United Nations Security Council: China, France, Russia, the United Kingdom, and the United States')
print('and the percentage of each of these country\'s population out of the world population as follows:')
print('China: %.2f%%' % popAgainstWorld(cn_pop))
print('France: %.2f%%' % popAgainstWorld(fr_pop))
print('Russia: %.2f%%' % popAgainstWorld(ru_pop))
print('United Kingdom: %.2f%%' % popAgainstWorld(uk_pop))
print('United States: %.2f%%' % popAgainstWorld(us_pop))
print('All Big Five: %.2f%%' % popAgainstWorld((cn_pop + fr_pop + ru_pop + uk_pop + us_pop)))

